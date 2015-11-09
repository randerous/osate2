/**
 */
package org.osate.categories.categories.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.categories.categories.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.osate.categories.categories.CategoriesPackage
 * @generated
 */
public class CategoriesSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CategoriesPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CategoriesSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CategoriesPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CategoriesPackage.CATEGORIES_DEFINITIONS:
      {
        CategoriesDefinitions categoriesDefinitions = (CategoriesDefinitions)theEObject;
        T result = caseCategoriesDefinitions(categoriesDefinitions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CategoriesPackage.CATEGORIES:
      {
        Categories categories = (Categories)theEObject;
        T result = caseCategories(categories);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CategoriesPackage.CATEGORY:
      {
        Category category = (Category)theEObject;
        T result = caseCategory(category);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CategoriesPackage.CATEGORY_FILTERS:
      {
        CategoryFilters categoryFilters = (CategoryFilters)theEObject;
        T result = caseCategoryFilters(categoryFilters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CategoriesPackage.REQUIREMENT_CATEGORIES:
      {
        RequirementCategories requirementCategories = (RequirementCategories)theEObject;
        T result = caseRequirementCategories(requirementCategories);
        if (result == null) result = caseCategories(requirementCategories);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CategoriesPackage.METHOD_CATEGORIES:
      {
        MethodCategories methodCategories = (MethodCategories)theEObject;
        T result = caseMethodCategories(methodCategories);
        if (result == null) result = caseCategories(methodCategories);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CategoriesPackage.SELECTION_CATEGORIES:
      {
        SelectionCategories selectionCategories = (SelectionCategories)theEObject;
        T result = caseSelectionCategories(selectionCategories);
        if (result == null) result = caseCategories(selectionCategories);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CategoriesPackage.QUALITY_CATEGORIES:
      {
        QualityCategories qualityCategories = (QualityCategories)theEObject;
        T result = caseQualityCategories(qualityCategories);
        if (result == null) result = caseCategories(qualityCategories);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CategoriesPackage.COMPONENT_CATEGORIES:
      {
        ComponentCategories componentCategories = (ComponentCategories)theEObject;
        T result = caseComponentCategories(componentCategories);
        if (result == null) result = caseCategories(componentCategories);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CategoriesPackage.REQUIREMENT_CATEGORY:
      {
        RequirementCategory requirementCategory = (RequirementCategory)theEObject;
        T result = caseRequirementCategory(requirementCategory);
        if (result == null) result = caseCategory(requirementCategory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CategoriesPackage.METHOD_CATEGORY:
      {
        MethodCategory methodCategory = (MethodCategory)theEObject;
        T result = caseMethodCategory(methodCategory);
        if (result == null) result = caseCategory(methodCategory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CategoriesPackage.SELECTION_CATEGORY:
      {
        SelectionCategory selectionCategory = (SelectionCategory)theEObject;
        T result = caseSelectionCategory(selectionCategory);
        if (result == null) result = caseCategory(selectionCategory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CategoriesPackage.QUALITY_CATEGORY:
      {
        QualityCategory qualityCategory = (QualityCategory)theEObject;
        T result = caseQualityCategory(qualityCategory);
        if (result == null) result = caseCategory(qualityCategory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CategoriesPackage.COMPONENT_CATEGORY:
      {
        ComponentCategory componentCategory = (ComponentCategory)theEObject;
        T result = caseComponentCategory(componentCategory);
        if (result == null) result = caseCategory(componentCategory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CategoriesPackage.CATEGORY_SET:
      {
        CategorySet categorySet = (CategorySet)theEObject;
        T result = caseCategorySet(categorySet);
        if (result == null) result = caseCategory(categorySet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definitions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definitions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategoriesDefinitions(CategoriesDefinitions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Categories</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Categories</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategories(Categories object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategory(Category object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Category Filters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category Filters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategoryFilters(CategoryFilters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement Categories</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement Categories</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirementCategories(RequirementCategories object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Categories</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Categories</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodCategories(MethodCategories object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection Categories</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection Categories</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectionCategories(SelectionCategories object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quality Categories</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quality Categories</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualityCategories(QualityCategories object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Categories</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Categories</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentCategories(ComponentCategories object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirementCategory(RequirementCategory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodCategory(MethodCategory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selection Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selection Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectionCategory(SelectionCategory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quality Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quality Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualityCategory(QualityCategory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentCategory(ComponentCategory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Category Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategorySet(CategorySet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CategoriesSwitch