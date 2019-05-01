pipeline {
    agent any
    stages {
    	stage('debug') {
    	    steps {
      			echo 'BRANCH ' + env.BRANCH_NAME + ", " + "${env.GIT_BRANCH}"
      			println("${env.GIT_BRANCH}" == "origin/master")
      			println("${env.GIT_BRANCH}" != "origin/master")
    	    }
    	}

		stage('PR Build') {
			when {
			    expression { return env.BRANCH_NAME }
			}
        	stages {
        	    stage('Build Pull Request') {
            		steps {
                		withMaven(
                    		// Maven installation declared in the Jenkins "Global Tool Configuration"
                    		maven: 'M3',
                    		// Maven settings.xml file defined with the Jenkins Config File Provider Plugin
                    		// Maven settings and global settings can also be defined in Jenkins Global Tools Configuration
                    		//mavenSettingsConfig: 'my-maven-settings',
    	                	mavenLocalRepo: '.repository') 
    	                {
	                        // Run the maven build
                        	echo 'mvn -T 3 -s core/osate.releng/seisettings.xml clean verify -Plocal -Dtycho.disableP2Mirrors=true -DfailIfNoTests=false -Dcodecoverage=true -Dspotbugs=true -Dpr.build=true'
                		} // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe & FindBugs reports...
            		}
        	    }
        	}
        }

		stage('Nightly Build') {
			when {
			    not {
			    	expression { return env.BRANCH_NAME }
			    }
			}
        	stages {
        	    stage('Build Products') {
            		steps {
                		withMaven(
                    		// Maven installation declared in the Jenkins "Global Tool Configuration"
                    		maven: 'M3',
                    		// Maven settings.xml file defined with the Jenkins Config File Provider Plugin
                    		// Maven settings and global settings can also be defined in Jenkins Global Tools Configuration
                    		//mavenSettingsConfig: 'my-maven-settings',
    	                	mavenLocalRepo: '.repository') 
    	                {
	                        // Run the maven build
                        	echo 'mvn -T 3 -s core/osate.releng/seisettings.xml clean verify -Pfull -Dtycho.disableP2Mirrors=true -DfailIfNoTests=false -Dcodecoverage=true -Dspotbugs=true'
                		} // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe & FindBugs reports...
            		}
        	    }
		        stage('Deploy') {
        			steps {
        				echo 'bash ./deploy.sh'
        			}
        		}
        	}
        }
    }
        
    post {
        always {
            jacoco execPattern: '**/**.exec', exclusionPattern: '**/ba/**,**/tests/**,**/src-gen/**', classPattern: '**/classes', sourcePattern: '**/src', sourceInclusionPattern: '**/*.java'
            recordIssues tool: spotBugs(pattern: '**/spotbugsXml.xml', reportEncodeing: 'UTF-8'), sourceCodeEncoding: 'UTF-8'
        }
        success {
			emailext (
      			subject: "SUCCESS: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
      			body: """<p>SUCCESS: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
        			<p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>"</p>""",
      			recipientProviders: [[$class: 'DevelopersRecipientProvider']]
    		)
        }
        failure {
			emailext (
      			subject: "FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
      			body: """<p>FAILED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
        			<p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>"</p>""",
      			recipientProviders: [[$class: 'DevelopersRecipientProvider']]
    		)
        }
		unstable {
			emailext (
      			subject: "UNSTABLE: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
      			body: """<p>UNSTABLE: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
        			<p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>"</p>""",
      			recipientProviders: [[$class: 'DevelopersRecipientProvider']]
    		)
		}
		fixed {
			emailext (
      			subject: "FIXED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
      			body: """<p>FIXED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
        			<p>Check console output at "<a href="${env.BUILD_URL}">${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>"</p>""",
      			recipientProviders: [[$class: 'DevelopersRecipientProvider']]
    		)
		}
    }
 
}