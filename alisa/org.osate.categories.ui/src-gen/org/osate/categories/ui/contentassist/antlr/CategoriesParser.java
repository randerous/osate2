/*
 * generated by Xtext
 */
package org.osate.categories.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.osate.categories.services.CategoriesGrammarAccess;

public class CategoriesParser extends AbstractContentAssistParser {
	
	@Inject
	private CategoriesGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.osate.categories.ui.contentassist.antlr.internal.InternalCategoriesParser createParser() {
		org.osate.categories.ui.contentassist.antlr.internal.InternalCategoriesParser result = new org.osate.categories.ui.contentassist.antlr.internal.InternalCategoriesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRequirementCategoriesAccess().getGroup(), "rule__RequirementCategories__Group__0");
					put(grammarAccess.getMethodCategoriesAccess().getGroup(), "rule__MethodCategories__Group__0");
					put(grammarAccess.getSelectionCategoriesAccess().getGroup(), "rule__SelectionCategories__Group__0");
					put(grammarAccess.getQualityCategoriesAccess().getGroup(), "rule__QualityCategories__Group__0");
					put(grammarAccess.getComponentCategoriesAccess().getGroup(), "rule__ComponentCategories__Group__0");
					put(grammarAccess.getRequirementCategoryAccess().getGroup(), "rule__RequirementCategory__Group__0");
					put(grammarAccess.getMethodCategoryAccess().getGroup(), "rule__MethodCategory__Group__0");
					put(grammarAccess.getSelectionCategoryAccess().getGroup(), "rule__SelectionCategory__Group__0");
					put(grammarAccess.getQualityCategoryAccess().getGroup(), "rule__QualityCategory__Group__0");
					put(grammarAccess.getComponentCategoryAccess().getGroup(), "rule__ComponentCategory__Group__0");
					put(grammarAccess.getCategoryFiltersAccess().getGroup(), "rule__CategoryFilters__Group__0");
					put(grammarAccess.getCategorySetAccess().getGroup(), "rule__CategorySet__Group__0");
					put(grammarAccess.getCategoriesDefinitionsAccess().getRequirementcategoriesAssignment_0(), "rule__CategoriesDefinitions__RequirementcategoriesAssignment_0");
					put(grammarAccess.getCategoriesDefinitionsAccess().getComponentcategoriesAssignment_1(), "rule__CategoriesDefinitions__ComponentcategoriesAssignment_1");
					put(grammarAccess.getCategoriesDefinitionsAccess().getMethodcategoriesAssignment_2(), "rule__CategoriesDefinitions__MethodcategoriesAssignment_2");
					put(grammarAccess.getCategoriesDefinitionsAccess().getSelectioncategoriesAssignment_3(), "rule__CategoriesDefinitions__SelectioncategoriesAssignment_3");
					put(grammarAccess.getCategoriesDefinitionsAccess().getQualitycategoriesAssignment_4(), "rule__CategoriesDefinitions__QualitycategoriesAssignment_4");
					put(grammarAccess.getCategoriesDefinitionsAccess().getCategoryfilterAssignment_5(), "rule__CategoriesDefinitions__CategoryfilterAssignment_5");
					put(grammarAccess.getRequirementCategoriesAccess().getCategoryAssignment_4(), "rule__RequirementCategories__CategoryAssignment_4");
					put(grammarAccess.getMethodCategoriesAccess().getCategoryAssignment_4(), "rule__MethodCategories__CategoryAssignment_4");
					put(grammarAccess.getSelectionCategoriesAccess().getCategoryAssignment_4(), "rule__SelectionCategories__CategoryAssignment_4");
					put(grammarAccess.getQualityCategoriesAccess().getCategoryAssignment_4(), "rule__QualityCategories__CategoryAssignment_4");
					put(grammarAccess.getComponentCategoriesAccess().getCategoryAssignment_4(), "rule__ComponentCategories__CategoryAssignment_4");
					put(grammarAccess.getRequirementCategoryAccess().getNameAssignment_1(), "rule__RequirementCategory__NameAssignment_1");
					put(grammarAccess.getMethodCategoryAccess().getNameAssignment_1(), "rule__MethodCategory__NameAssignment_1");
					put(grammarAccess.getSelectionCategoryAccess().getNameAssignment_1(), "rule__SelectionCategory__NameAssignment_1");
					put(grammarAccess.getQualityCategoryAccess().getNameAssignment_1(), "rule__QualityCategory__NameAssignment_1");
					put(grammarAccess.getComponentCategoryAccess().getNameAssignment_1(), "rule__ComponentCategory__NameAssignment_1");
					put(grammarAccess.getCategoryFiltersAccess().getFiltersAssignment_3(), "rule__CategoryFilters__FiltersAssignment_3");
					put(grammarAccess.getCategorySetAccess().getNameAssignment_1(), "rule__CategorySet__NameAssignment_1");
					put(grammarAccess.getCategorySetAccess().getElementsAssignment_3(), "rule__CategorySet__ElementsAssignment_3");
					put(grammarAccess.getCategoriesDefinitionsAccess().getUnorderedGroup(), "rule__CategoriesDefinitions__UnorderedGroup");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.osate.categories.ui.contentassist.antlr.internal.InternalCategoriesParser typedParser = (org.osate.categories.ui.contentassist.antlr.internal.InternalCategoriesParser) parser;
			typedParser.entryRuleCategoriesDefinitions();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public CategoriesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CategoriesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}