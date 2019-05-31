package org.osate.expr.scoping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.osate.aadl2.modelsupport.scoping.IDelegatingEClassGlobalScopeProvider;
import org.osate.aadl2.modelsupport.scoping.IEClassGlobalScopeProvider;

public class ExprGlobalScopeProvider implements IDelegatingEClassGlobalScopeProvider {

	static IEClassGlobalScopeProvider delegate = IResourceServiceProvider.Registry.INSTANCE
			.getResourceServiceProvider(URI.createFileURI("dummy.aadl")).get(IEClassGlobalScopeProvider.class);

	@Override
	public IEClassGlobalScopeProvider getDelegate() {
		return delegate;
	}

}