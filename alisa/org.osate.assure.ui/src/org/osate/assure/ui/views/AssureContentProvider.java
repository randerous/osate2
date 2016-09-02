/**
 * Copyright 2015 Carnegie Mellon University. All Rights Reserved.
 *
 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING INSTITUTE
 * MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. CARNEGIE MELLON UNIVERSITY MAKES NO
 * WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE OR MERCHANTABILITY,
 * EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. CARNEGIE MELLON
 * UNIVERSITY DOES NOT MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM
 * PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 *
 * Released under the Eclipse Public License (http://www.eclipse.org/org/documents/epl-v10.php)
 *
 * See COPYRIGHT file for full details.
 */

package org.osate.assure.ui.views;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class AssureContentProvider implements ITreeContentProvider {
	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		@SuppressWarnings("rawtypes")
		List roots = (List) inputElement;
		return roots.toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
//		if (parentElement instanceof AssuranceCaseResult) {
//			AssuranceCaseResult node = (AssuranceCaseResult) parentElement;
//			return node.getModelResult().toArray();
//		}
//		if (parentElement instanceof SubsystemResult) {
//			SubsystemResult node = (SubsystemResult) parentElement;
//			EList<EObject> kids = new BasicEList<EObject>();
//			kids.addAll(node.getClaimResult());
//			kids.addAll(node.getSubsystemResult());
//			return kids.toArray();
//		}
//		if (parentElement instanceof ModelResult) {
//			ModelResult node = (ModelResult) parentElement;
//			EList<EObject> kids = new BasicEList<EObject>();
//			kids.addAll(node.getClaimResult());
//			kids.addAll(node.getSubsystemResult());
//			kids.addAll(node.getSubAssuranceCase());
//			return kids.toArray();
//		}
//		if (parentElement instanceof ClaimResult) {
//			ClaimResult node = (ClaimResult) parentElement;
//			EList<EObject> kids = new BasicEList<EObject>();
//			kids.addAll(node.getVerificationActivityResult());
//			kids.addAll(node.getSubClaimResult());
//			return kids.toArray();
//		}
//		if (parentElement instanceof VerificationActivityResult) {
//			VerificationActivityResult node = (VerificationActivityResult) parentElement;
//			EList<EObject> kids = new BasicEList<EObject>();
//			kids.add(node.getPreconditionResult());
//			kids.add(node.getValidationResult());
//			return kids.toArray();
//		}
//		if (parentElement instanceof ValidationResult) {
//			return ArrayUtils.EMPTY_OBJECT_ARRAY;
//		}
//		if (parentElement instanceof PreconditionResult) {
//			return ArrayUtils.EMPTY_OBJECT_ARRAY;
//		}
		if (parentElement instanceof EObject) {
			EObject node = (EObject) parentElement;
			return node.eContents().toArray();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof EObject) {
			EObject node = (EObject) element;
			return !node.eContents().isEmpty();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
