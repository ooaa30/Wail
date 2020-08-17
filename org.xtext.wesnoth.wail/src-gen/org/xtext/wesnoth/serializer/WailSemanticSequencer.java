/*
 * generated by Xtext 2.22.0
 */
package org.xtext.wesnoth.serializer;

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
import org.xtext.wesnoth.services.WailGrammarAccess;
import org.xtext.wesnoth.wail.Aggression;
import org.xtext.wesnoth.wail.AtLocation;
import org.xtext.wesnoth.wail.Baseline;
import org.xtext.wesnoth.wail.Caution;
import org.xtext.wesnoth.wail.Conditional;
import org.xtext.wesnoth.wail.Damage;
import org.xtext.wesnoth.wail.Defualt_CA;
import org.xtext.wesnoth.wail.Fragment;
import org.xtext.wesnoth.wail.GoaLocation;
import org.xtext.wesnoth.wail.Goal;
import org.xtext.wesnoth.wail.Grouping;
import org.xtext.wesnoth.wail.IDEquals;
import org.xtext.wesnoth.wail.Model;
import org.xtext.wesnoth.wail.ProtectLeader;
import org.xtext.wesnoth.wail.ProtectLocation;
import org.xtext.wesnoth.wail.ProtectUnitID;
import org.xtext.wesnoth.wail.ProtectUnitType;
import org.xtext.wesnoth.wail.Recruitment;
import org.xtext.wesnoth.wail.Rule;
import org.xtext.wesnoth.wail.UnitEquals;
import org.xtext.wesnoth.wail.WailPackage;

@SuppressWarnings("all")
public class WailSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WailGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == WailPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case WailPackage.AGGRESSION:
				sequence_Aggression(context, (Aggression) semanticObject); 
				return; 
			case WailPackage.AT_LOCATION:
				sequence_AtLocation(context, (AtLocation) semanticObject); 
				return; 
			case WailPackage.BASELINE:
				sequence_Baseline(context, (Baseline) semanticObject); 
				return; 
			case WailPackage.CAUTION:
				sequence_Caution(context, (Caution) semanticObject); 
				return; 
			case WailPackage.CONDITIONAL:
				sequence_Conditional(context, (Conditional) semanticObject); 
				return; 
			case WailPackage.DAMAGE:
				sequence_Damage(context, (Damage) semanticObject); 
				return; 
			case WailPackage.DEFUALT_CA:
				sequence_Defualt_CA(context, (Defualt_CA) semanticObject); 
				return; 
			case WailPackage.FRAGMENT:
				sequence_Fragment(context, (Fragment) semanticObject); 
				return; 
			case WailPackage.GOA_LOCATION:
				sequence_GoaLocation(context, (GoaLocation) semanticObject); 
				return; 
			case WailPackage.GOAL:
				sequence_Goal(context, (Goal) semanticObject); 
				return; 
			case WailPackage.GROUPING:
				sequence_Grouping(context, (Grouping) semanticObject); 
				return; 
			case WailPackage.ID_EQUALS:
				sequence_IDEquals(context, (IDEquals) semanticObject); 
				return; 
			case WailPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case WailPackage.PROTECT_LEADER:
				sequence_ProtectLeader(context, (ProtectLeader) semanticObject); 
				return; 
			case WailPackage.PROTECT_LOCATION:
				sequence_ProtectLocation(context, (ProtectLocation) semanticObject); 
				return; 
			case WailPackage.PROTECT_UNIT_ID:
				sequence_ProtectUnitID(context, (ProtectUnitID) semanticObject); 
				return; 
			case WailPackage.PROTECT_UNIT_TYPE:
				sequence_ProtectUnitType(context, (ProtectUnitType) semanticObject); 
				return; 
			case WailPackage.RECRUITMENT:
				sequence_Recruitment(context, (Recruitment) semanticObject); 
				return; 
			case WailPackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case WailPackage.UNIT_EQUALS:
				sequence_UnitEquals(context, (UnitEquals) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Aggression returns Aggression
	 *
	 * Constraint:
	 *     aggressionVal=DECIMAL
	 */
	protected void sequence_Aggression(ISerializationContext context, Aggression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.AGGRESSION__AGGRESSION_VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.AGGRESSION__AGGRESSION_VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAggressionAccess().getAggressionValDECIMALParserRuleCall_2_0(), semanticObject.getAggressionVal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     whenRules returns AtLocation
	 *     AtLocation returns AtLocation
	 *
	 * Constraint:
	 *     (XAxis=INT YAxis=INT)
	 */
	protected void sequence_AtLocation(ISerializationContext context, AtLocation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.AT_LOCATION__XAXIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.AT_LOCATION__XAXIS));
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.AT_LOCATION__YAXIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.AT_LOCATION__YAXIS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtLocationAccess().getXAxisINTTerminalRuleCall_1_0(), semanticObject.getXAxis());
		feeder.accept(grammarAccess.getAtLocationAccess().getYAxisINTTerminalRuleCall_3_0(), semanticObject.getYAxis());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     whenRules returns Baseline
	 *     Baseline returns Baseline
	 *
	 * Constraint:
	 *     always='always'
	 */
	protected void sequence_Baseline(ISerializationContext context, Baseline semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.BASELINE__ALWAYS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.BASELINE__ALWAYS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBaselineAccess().getAlwaysAlwaysKeyword_0(), semanticObject.getAlways());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Caution returns Caution
	 *
	 * Constraint:
	 *     cautionval=DECIMAL
	 */
	protected void sequence_Caution(ISerializationContext context, Caution semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.CAUTION__CAUTIONVAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.CAUTION__CAUTIONVAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCautionAccess().getCautionvalDECIMALParserRuleCall_2_0(), semanticObject.getCautionval());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Conditional returns Conditional
	 *
	 * Constraint:
	 *     x+=whenRules
	 */
	protected void sequence_Conditional(ISerializationContext context, Conditional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     whenRules returns Damage
	 *     Damage returns Damage
	 *
	 * Constraint:
	 *     health=INT
	 */
	protected void sequence_Damage(ISerializationContext context, Damage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.DAMAGE__HEALTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.DAMAGE__HEALTH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDamageAccess().getHealthINTTerminalRuleCall_2_0(), semanticObject.getHealth());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Defualt_CA returns Defualt_CA
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             caType='movement' | 
	 *             caType='heal' | 
	 *             caType='retreat' | 
	 *             caType='combat' | 
	 *             caType='recruit' | 
	 *             caType='combat_value_targets' | 
	 *             caType='capture_villages' | 
	 *             caType='leader_to_keep'
	 *         ) 
	 *         cost=INT?
	 *     )
	 */
	protected void sequence_Defualt_CA(ISerializationContext context, Defualt_CA semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Fragment returns Fragment
	 *
	 * Constraint:
	 *     (condition=Conditional defualt_cas+=Defualt_CA*)
	 */
	protected void sequence_Fragment(ISerializationContext context, Fragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GoaLocation returns GoaLocation
	 *
	 * Constraint:
	 *     (XAxis=INT YAxis=INT locValue=INT)
	 */
	protected void sequence_GoaLocation(ISerializationContext context, GoaLocation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.GOA_LOCATION__XAXIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.GOA_LOCATION__XAXIS));
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.GOA_LOCATION__YAXIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.GOA_LOCATION__YAXIS));
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.GOA_LOCATION__LOC_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.GOA_LOCATION__LOC_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGoaLocationAccess().getXAxisINTTerminalRuleCall_2_0(), semanticObject.getXAxis());
		feeder.accept(grammarAccess.getGoaLocationAccess().getYAxisINTTerminalRuleCall_4_0(), semanticObject.getYAxis());
		feeder.accept(grammarAccess.getGoaLocationAccess().getLocValueINTTerminalRuleCall_7_0(), semanticObject.getLocValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Goal returns Goal
	 *
	 * Constraint:
	 *     goal=GoaLocation
	 */
	protected void sequence_Goal(ISerializationContext context, Goal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.GOAL__GOAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.GOAL__GOAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGoalAccess().getGoalGoaLocationParserRuleCall_0_2_0(), semanticObject.getGoal());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Grouping returns Grouping
	 *
	 * Constraint:
	 *     (groupingVal='offensive' | groupingVal='defensive' | groupingVal='none')
	 */
	protected void sequence_Grouping(ISerializationContext context, Grouping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     whenRules returns IDEquals
	 *     IDEquals returns IDEquals
	 *
	 * Constraint:
	 *     unitID=STRING
	 */
	protected void sequence_IDEquals(ISerializationContext context, IDEquals semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.ID_EQUALS__UNIT_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.ID_EQUALS__UNIT_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIDEqualsAccess().getUnitIDSTRINGTerminalRuleCall_2_0(), semanticObject.getUnitID());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     elements+=Rule+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Goal returns ProtectLeader
	 *     ProtectLeader returns ProtectLeader
	 *
	 * Constraint:
	 *     (locationValue=INT protectionRadius=INT procSide=INT)
	 */
	protected void sequence_ProtectLeader(ISerializationContext context, ProtectLeader semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_LEADER__LOCATION_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_LEADER__LOCATION_VALUE));
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_LEADER__PROTECTION_RADIUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_LEADER__PROTECTION_RADIUS));
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_LEADER__PROC_SIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_LEADER__PROC_SIDE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProtectLeaderAccess().getLocationValueINTTerminalRuleCall_4_0(), semanticObject.getLocationValue());
		feeder.accept(grammarAccess.getProtectLeaderAccess().getProtectionRadiusINTTerminalRuleCall_7_0(), semanticObject.getProtectionRadius());
		feeder.accept(grammarAccess.getProtectLeaderAccess().getProcSideINTTerminalRuleCall_10_0(), semanticObject.getProcSide());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Goal returns ProtectLocation
	 *     ProtectLocation returns ProtectLocation
	 *
	 * Constraint:
	 *     (XAxis=INT YAxis=INT locValue=INT procRad=INT)
	 */
	protected void sequence_ProtectLocation(ISerializationContext context, ProtectLocation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_LOCATION__XAXIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_LOCATION__XAXIS));
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_LOCATION__YAXIS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_LOCATION__YAXIS));
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_LOCATION__LOC_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_LOCATION__LOC_VALUE));
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_LOCATION__PROC_RAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_LOCATION__PROC_RAD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProtectLocationAccess().getXAxisINTTerminalRuleCall_2_0(), semanticObject.getXAxis());
		feeder.accept(grammarAccess.getProtectLocationAccess().getYAxisINTTerminalRuleCall_4_0(), semanticObject.getYAxis());
		feeder.accept(grammarAccess.getProtectLocationAccess().getLocValueINTTerminalRuleCall_7_0(), semanticObject.getLocValue());
		feeder.accept(grammarAccess.getProtectLocationAccess().getProcRadINTTerminalRuleCall_10_0(), semanticObject.getProcRad());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Goal returns ProtectUnitID
	 *     ProtectUnitID returns ProtectUnitID
	 *
	 * Constraint:
	 *     (locationValue=INT protectionRadius=INT procSide=INT procID=STRING)
	 */
	protected void sequence_ProtectUnitID(ISerializationContext context, ProtectUnitID semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_UNIT_ID__LOCATION_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_UNIT_ID__LOCATION_VALUE));
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_UNIT_ID__PROTECTION_RADIUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_UNIT_ID__PROTECTION_RADIUS));
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_UNIT_ID__PROC_SIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_UNIT_ID__PROC_SIDE));
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_UNIT_ID__PROC_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_UNIT_ID__PROC_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProtectUnitIDAccess().getLocationValueINTTerminalRuleCall_4_0(), semanticObject.getLocationValue());
		feeder.accept(grammarAccess.getProtectUnitIDAccess().getProtectionRadiusINTTerminalRuleCall_7_0(), semanticObject.getProtectionRadius());
		feeder.accept(grammarAccess.getProtectUnitIDAccess().getProcSideINTTerminalRuleCall_10_0(), semanticObject.getProcSide());
		feeder.accept(grammarAccess.getProtectUnitIDAccess().getProcIDSTRINGTerminalRuleCall_13_0(), semanticObject.getProcID());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Goal returns ProtectUnitType
	 *     ProtectUnitType returns ProtectUnitType
	 *
	 * Constraint:
	 *     (locationValue=INT protectionRadius=INT procSide=INT procType=STRING)
	 */
	protected void sequence_ProtectUnitType(ISerializationContext context, ProtectUnitType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_UNIT_TYPE__LOCATION_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_UNIT_TYPE__LOCATION_VALUE));
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_UNIT_TYPE__PROTECTION_RADIUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_UNIT_TYPE__PROTECTION_RADIUS));
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_UNIT_TYPE__PROC_SIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_UNIT_TYPE__PROC_SIDE));
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.PROTECT_UNIT_TYPE__PROC_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.PROTECT_UNIT_TYPE__PROC_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProtectUnitTypeAccess().getLocationValueINTTerminalRuleCall_4_0(), semanticObject.getLocationValue());
		feeder.accept(grammarAccess.getProtectUnitTypeAccess().getProtectionRadiusINTTerminalRuleCall_7_0(), semanticObject.getProtectionRadius());
		feeder.accept(grammarAccess.getProtectUnitTypeAccess().getProcSideINTTerminalRuleCall_10_0(), semanticObject.getProcSide());
		feeder.accept(grammarAccess.getProtectUnitTypeAccess().getProcTypeSTRINGTerminalRuleCall_13_0(), semanticObject.getProcType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Recruitment returns Recruitment
	 *
	 * Constraint:
	 *     (unitslist=UNITLIST turns=COMMAINT? importance=INT? number=INT?)
	 */
	protected void sequence_Recruitment(ISerializationContext context, Recruitment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         fragments+=Fragment* 
	 *         goals+=Goal* 
	 *         aggressionval=Aggression 
	 *         cautionval=Caution 
	 *         GroupingVal=Grouping 
	 *         units+=Recruitment*
	 *     )
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     whenRules returns UnitEquals
	 *     UnitEquals returns UnitEquals
	 *
	 * Constraint:
	 *     unit=STRING
	 */
	protected void sequence_UnitEquals(ISerializationContext context, UnitEquals semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WailPackage.Literals.UNIT_EQUALS__UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WailPackage.Literals.UNIT_EQUALS__UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnitEqualsAccess().getUnitSTRINGTerminalRuleCall_2_0(), semanticObject.getUnit());
		feeder.finish();
	}
	
	
}
