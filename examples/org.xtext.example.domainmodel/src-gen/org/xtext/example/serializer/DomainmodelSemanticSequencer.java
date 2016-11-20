/*
 * generated by Xtext
 */
package org.xtext.example.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.domainmodel.DomainModel;
import org.xtext.example.domainmodel.DomainmodelPackage;
import org.xtext.example.domainmodel.Entity;
import org.xtext.example.domainmodel.ImportDeclaration;
import org.xtext.example.domainmodel.ImportSection;
import org.xtext.example.domainmodel.Operation;
import org.xtext.example.domainmodel.PackageDeclaration;
import org.xtext.example.domainmodel.Property;
import org.xtext.example.services.DomainmodelGrammarAccess;

@SuppressWarnings("all")
public class DomainmodelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DomainmodelGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DomainmodelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DomainmodelPackage.DOMAIN_MODEL:
				sequence_DomainModel(context, (DomainModel) semanticObject); 
				return; 
			case DomainmodelPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case DomainmodelPackage.IMPORT_DECLARATION:
				sequence_ImportDeclaration(context, (ImportDeclaration) semanticObject); 
				return; 
			case DomainmodelPackage.IMPORT_SECTION:
				sequence_ImportSection(context, (ImportSection) semanticObject); 
				return; 
			case DomainmodelPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case DomainmodelPackage.PACKAGE_DECLARATION:
				sequence_PackageDeclaration(context, (PackageDeclaration) semanticObject); 
				return; 
			case DomainmodelPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DomainModel returns DomainModel
	 *
	 * Constraint:
	 *     ((importSection=ImportSection elements+=AbstractElement+) | elements+=AbstractElement+)?
	 */
	protected void sequence_DomainModel(ISerializationContext context, DomainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns Entity
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ValidID superType=[Entity|QualifiedName]? features+=Feature*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImportDeclaration returns ImportDeclaration
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_ImportDeclaration(ISerializationContext context, ImportDeclaration semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.IMPORT_DECLARATION__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.IMPORT_DECLARATION__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportDeclarationAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImportSection returns ImportSection
	 *
	 * Constraint:
	 *     importDeclarations+=ImportDeclaration+
	 */
	protected void sequence_ImportSection(ISerializationContext context, ImportSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Operation
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (name=ValidID (params+=ID params+=ID*)? type=[Entity|ID]?)
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns PackageDeclaration
	 *     PackageDeclaration returns PackageDeclaration
	 *
	 * Constraint:
	 *     (name=QualifiedName elements+=AbstractElement*)
	 */
	protected void sequence_PackageDeclaration(ISerializationContext context, PackageDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns Property
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (name=ValidID type=[Entity|ID])
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.FEATURE__NAME));
			if (transientValues.isValueTransient(semanticObject, DomainmodelPackage.Literals.FEATURE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DomainmodelPackage.Literals.FEATURE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyAccess().getNameValidIDParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPropertyAccess().getTypeEntityIDTerminalRuleCall_2_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
}