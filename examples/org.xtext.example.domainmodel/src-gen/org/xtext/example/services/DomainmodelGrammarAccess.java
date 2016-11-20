/*
 * generated by Xtext
 */
package org.xtext.example.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class DomainmodelGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class DomainModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.Domainmodel.DomainModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportSectionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportSectionImportSectionParserRuleCall_0_0 = (RuleCall)cImportSectionAssignment_0.eContents().get(0);
		private final Assignment cElementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementsAbstractElementParserRuleCall_1_0 = (RuleCall)cElementsAssignment_1.eContents().get(0);
		
		//DomainModel:
		//	importSection=ImportSection?
		//	elements+=AbstractElement*;
		@Override public ParserRule getRule() { return rule; }

		//importSection=ImportSection? elements+=AbstractElement*
		public Group getGroup() { return cGroup; }

		//importSection=ImportSection?
		public Assignment getImportSectionAssignment_0() { return cImportSectionAssignment_0; }

		//ImportSection
		public RuleCall getImportSectionImportSectionParserRuleCall_0_0() { return cImportSectionImportSectionParserRuleCall_0_0; }

		//elements+=AbstractElement*
		public Assignment getElementsAssignment_1() { return cElementsAssignment_1; }

		//AbstractElement
		public RuleCall getElementsAbstractElementParserRuleCall_1_0() { return cElementsAbstractElementParserRuleCall_1_0; }
	}

	public class AbstractElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.Domainmodel.AbstractElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPackageDeclarationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractElement:
		//	PackageDeclaration | Entity;
		@Override public ParserRule getRule() { return rule; }

		//PackageDeclaration | Entity
		public Alternatives getAlternatives() { return cAlternatives; }

		//PackageDeclaration
		public RuleCall getPackageDeclarationParserRuleCall_0() { return cPackageDeclarationParserRuleCall_0; }

		//Entity
		public RuleCall getEntityParserRuleCall_1() { return cEntityParserRuleCall_1; }
	}

	public class PackageDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.Domainmodel.PackageDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsAbstractElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//PackageDeclaration:
		//	'package' name=QualifiedName '{'
		//	elements+=AbstractElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }

		//'package' name=QualifiedName '{' elements+=AbstractElement* '}'
		public Group getGroup() { return cGroup; }

		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//elements+=AbstractElement*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }

		//AbstractElement
		public RuleCall getElementsAbstractElementParserRuleCall_3_0() { return cElementsAbstractElementParserRuleCall_3_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.Domainmodel.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameValidIDParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeEntityCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cSuperTypeEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFeaturesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFeaturesFeatureParserRuleCall_4_0 = (RuleCall)cFeaturesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Entity:
		//	'entity' name=ValidID ('extends' superType=[Entity|QualifiedName])? '{'
		//	features+=Feature*
		//	'}';
		@Override public ParserRule getRule() { return rule; }

		//'entity' name=ValidID ('extends' superType=[Entity|QualifiedName])? '{' features+=Feature* '}'
		public Group getGroup() { return cGroup; }

		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }

		//name=ValidID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ValidID
		public RuleCall getNameValidIDParserRuleCall_1_0() { return cNameValidIDParserRuleCall_1_0; }

		//('extends' superType=[Entity|QualifiedName])?
		public Group getGroup_2() { return cGroup_2; }

		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }

		//superType=[Entity|QualifiedName]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }

		//[Entity|QualifiedName]
		public CrossReference getSuperTypeEntityCrossReference_2_1_0() { return cSuperTypeEntityCrossReference_2_1_0; }

		//QualifiedName
		public RuleCall getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1() { return cSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//features+=Feature*
		public Assignment getFeaturesAssignment_4() { return cFeaturesAssignment_4; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_4_0() { return cFeaturesFeatureParserRuleCall_4_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.Domainmodel.Feature");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPropertyParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOperationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Feature:
		//	Property | Operation;
		@Override public ParserRule getRule() { return rule; }

		//Property | Operation
		public Alternatives getAlternatives() { return cAlternatives; }

		//Property
		public RuleCall getPropertyParserRuleCall_0() { return cPropertyParserRuleCall_0; }

		//Operation
		public RuleCall getOperationParserRuleCall_1() { return cOperationParserRuleCall_1; }
	}

	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.Domainmodel.Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameValidIDParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeEntityCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeEntityIDTerminalRuleCall_2_0_1 = (RuleCall)cTypeEntityCrossReference_2_0.eContents().get(1);
		
		//Property:
		//	name=ValidID ':' type=[Entity];
		@Override public ParserRule getRule() { return rule; }

		//name=ValidID ':' type=[Entity]
		public Group getGroup() { return cGroup; }

		//name=ValidID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ValidID
		public RuleCall getNameValidIDParserRuleCall_0_0() { return cNameValidIDParserRuleCall_0_0; }

		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//type=[Entity]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[Entity]
		public CrossReference getTypeEntityCrossReference_2_0() { return cTypeEntityCrossReference_2_0; }

		//ID
		public RuleCall getTypeEntityIDTerminalRuleCall_2_0_1() { return cTypeEntityIDTerminalRuleCall_2_0_1; }
	}

	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.Domainmodel.Operation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOpKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameValidIDParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cParamsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cParamsIDTerminalRuleCall_3_0_0 = (RuleCall)cParamsAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cParamsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cParamsIDTerminalRuleCall_3_1_1_0 = (RuleCall)cParamsAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cTypeAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cTypeEntityCrossReference_5_1_0 = (CrossReference)cTypeAssignment_5_1.eContents().get(0);
		private final RuleCall cTypeEntityIDTerminalRuleCall_5_1_0_1 = (RuleCall)cTypeEntityCrossReference_5_1_0.eContents().get(1);
		
		//Operation:
		//	'op' name=ValidID '(' (params+=ID (',' params+=ID)*)? ')' (':' type=[Entity])?
		//	/ *body=BlockExpression* /;
		@Override public ParserRule getRule() { return rule; }

		//'op' name=ValidID '(' (params+=ID (',' params+=ID)*)? ')' (':' type=[Entity])?
		public Group getGroup() { return cGroup; }

		//'op'
		public Keyword getOpKeyword_0() { return cOpKeyword_0; }

		//name=ValidID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ValidID
		public RuleCall getNameValidIDParserRuleCall_1_0() { return cNameValidIDParserRuleCall_1_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//(params+=ID (',' params+=ID)*)?
		public Group getGroup_3() { return cGroup_3; }

		//params+=ID
		public Assignment getParamsAssignment_3_0() { return cParamsAssignment_3_0; }

		//ID
		public RuleCall getParamsIDTerminalRuleCall_3_0_0() { return cParamsIDTerminalRuleCall_3_0_0; }

		//(',' params+=ID)*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//','
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }

		//params+=ID
		public Assignment getParamsAssignment_3_1_1() { return cParamsAssignment_3_1_1; }

		//ID
		public RuleCall getParamsIDTerminalRuleCall_3_1_1_0() { return cParamsIDTerminalRuleCall_3_1_1_0; }

		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }

		//(':' type=[Entity])?
		public Group getGroup_5() { return cGroup_5; }

		//':'
		public Keyword getColonKeyword_5_0() { return cColonKeyword_5_0; }

		//type=[Entity]
		public Assignment getTypeAssignment_5_1() { return cTypeAssignment_5_1; }

		//[Entity]
		public CrossReference getTypeEntityCrossReference_5_1_0() { return cTypeEntityCrossReference_5_1_0; }

		//ID
		public RuleCall getTypeEntityIDTerminalRuleCall_5_1_0_1() { return cTypeEntityIDTerminalRuleCall_5_1_0_1; }
	}

	public class BlockExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.Domainmodel.BlockExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cCodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//BlockExpression:
		//	'{' 'code' '}';
		@Override public ParserRule getRule() { return rule; }

		//'{' 'code' '}'
		public Group getGroup() { return cGroup; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//'code'
		public Keyword getCodeKeyword_1() { return cCodeKeyword_1; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}

	public class ImportSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.Domainmodel.ImportSection");
		private final Assignment cImportDeclarationsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cImportDeclarationsImportDeclarationParserRuleCall_0 = (RuleCall)cImportDeclarationsAssignment.eContents().get(0);
		
		//ImportSection:
		//	importDeclarations+=ImportDeclaration+;
		@Override public ParserRule getRule() { return rule; }

		//importDeclarations+=ImportDeclaration+
		public Assignment getImportDeclarationsAssignment() { return cImportDeclarationsAssignment; }

		//ImportDeclaration
		public RuleCall getImportDeclarationsImportDeclarationParserRuleCall_0() { return cImportDeclarationsImportDeclarationParserRuleCall_0; }
	}

	public class ImportDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.Domainmodel.ImportDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ImportDeclaration:
		//	'import' importedNamespace=QualifiedNameWithWildcard ';'?;
		@Override public ParserRule getRule() { return rule; }

		//'import' importedNamespace=QualifiedNameWithWildcard ';'?
		public Group getGroup() { return cGroup; }

		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }

		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0; }

		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.Domainmodel.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cValidIDParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cValidIDParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ValidID ('.' ValidID)*;
		@Override public ParserRule getRule() { return rule; }

		//ValidID ('.' ValidID)*
		public Group getGroup() { return cGroup; }

		//ValidID
		public RuleCall getValidIDParserRuleCall_0() { return cValidIDParserRuleCall_0; }

		//('.' ValidID)*
		public Group getGroup_1() { return cGroup_1; }

		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ValidID
		public RuleCall getValidIDParserRuleCall_1_1() { return cValidIDParserRuleCall_1_1; }
	}

	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.Domainmodel.QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAsteriskKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName '.' '*';
		@Override public ParserRule getRule() { return rule; }

		//QualifiedName '.' '*'
		public Group getGroup() { return cGroup; }

		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }

		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }

		//'*'
		public Keyword getAsteriskKeyword_2() { return cAsteriskKeyword_2; }
	}

	public class ValidIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.Domainmodel.ValidID");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ValidID:
		//	ID;
		@Override public ParserRule getRule() { return rule; }

		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	
	private final DomainModelElements pDomainModel;
	private final AbstractElementElements pAbstractElement;
	private final PackageDeclarationElements pPackageDeclaration;
	private final EntityElements pEntity;
	private final FeatureElements pFeature;
	private final PropertyElements pProperty;
	private final OperationElements pOperation;
	private final BlockExpressionElements pBlockExpression;
	private final ImportSectionElements pImportSection;
	private final ImportDeclarationElements pImportDeclaration;
	private final QualifiedNameElements pQualifiedName;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final ValidIDElements pValidID;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DomainmodelGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDomainModel = new DomainModelElements();
		this.pAbstractElement = new AbstractElementElements();
		this.pPackageDeclaration = new PackageDeclarationElements();
		this.pEntity = new EntityElements();
		this.pFeature = new FeatureElements();
		this.pProperty = new PropertyElements();
		this.pOperation = new OperationElements();
		this.pBlockExpression = new BlockExpressionElements();
		this.pImportSection = new ImportSectionElements();
		this.pImportDeclaration = new ImportDeclarationElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pValidID = new ValidIDElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.Domainmodel".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//DomainModel:
	//	importSection=ImportSection?
	//	elements+=AbstractElement*;
	public DomainModelElements getDomainModelAccess() {
		return pDomainModel;
	}
	
	public ParserRule getDomainModelRule() {
		return getDomainModelAccess().getRule();
	}

	//AbstractElement:
	//	PackageDeclaration | Entity;
	public AbstractElementElements getAbstractElementAccess() {
		return pAbstractElement;
	}
	
	public ParserRule getAbstractElementRule() {
		return getAbstractElementAccess().getRule();
	}

	//PackageDeclaration:
	//	'package' name=QualifiedName '{'
	//	elements+=AbstractElement*
	//	'}';
	public PackageDeclarationElements getPackageDeclarationAccess() {
		return pPackageDeclaration;
	}
	
	public ParserRule getPackageDeclarationRule() {
		return getPackageDeclarationAccess().getRule();
	}

	//Entity:
	//	'entity' name=ValidID ('extends' superType=[Entity|QualifiedName])? '{'
	//	features+=Feature*
	//	'}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}

	//Feature:
	//	Property | Operation;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//Property:
	//	name=ValidID ':' type=[Entity];
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}

	//Operation:
	//	'op' name=ValidID '(' (params+=ID (',' params+=ID)*)? ')' (':' type=[Entity])?
	//	/ *body=BlockExpression* /;
	public OperationElements getOperationAccess() {
		return pOperation;
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}

	//BlockExpression:
	//	'{' 'code' '}';
	public BlockExpressionElements getBlockExpressionAccess() {
		return pBlockExpression;
	}
	
	public ParserRule getBlockExpressionRule() {
		return getBlockExpressionAccess().getRule();
	}

	//ImportSection:
	//	importDeclarations+=ImportDeclaration+;
	public ImportSectionElements getImportSectionAccess() {
		return pImportSection;
	}
	
	public ParserRule getImportSectionRule() {
		return getImportSectionAccess().getRule();
	}

	//ImportDeclaration:
	//	'import' importedNamespace=QualifiedNameWithWildcard ';'?;
	public ImportDeclarationElements getImportDeclarationAccess() {
		return pImportDeclaration;
	}
	
	public ParserRule getImportDeclarationRule() {
		return getImportDeclarationAccess().getRule();
	}

	//QualifiedName:
	//	ValidID ('.' ValidID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//QualifiedNameWithWildcard:
	//	QualifiedName '.' '*';
	public QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return pQualifiedNameWithWildcard;
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}

	//ValidID:
	//	ID;
	public ValidIDElements getValidIDAccess() {
		return pValidID;
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
