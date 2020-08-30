## Welcome to Wail

Wail is a Domain Specific language for modelling the AI in the game Battle for Wesnoth.

Wail was developed for a Final Year project and uses Xtext to aid in this process.

To install the project, simply download a zip of the whole project and import the plugin found within the wailplugin file. This should then give you access to the whole of the language and associated tooling.

In Wesnoth the AI works by selecting an action for each unit based on the current state of the board. This DSL allows a user to manipulate which candidate actions can be included, their possible evaluation scores, a few aspects that influence the calculation of actions ( such as aggressivness) and goals that the AI should work towards. This is then compiled directly to WML (wesnoth markup language) which can then be copied into the scenario or map of your choice.

In the language all models are made up a number of rules. A rule consists of any number of Candidate actions, any number of goals, followed by an aggression value (between 0 and 1) a caution value (again between 0 and 1) and a grouping type (aggressive, defensive and none) and an optional recruitment set. 

A valid example code can be found below:

rule "test"{
	when: always{
		movement
		combat
		retreat
		heal
		combat_value_targets
	}
	goal is attack x 5 y 5 value is 1
	aggression is 0.5
	caution is 0.3
	grouping is none
}

A candidate set can have several conditions
  always
  unit is (valid unit ID)
  unit at (x and y location)
  health is (health value)

Valid Candidate Actions include:
  Movement
  Combat
  Retreat
  Heal
  Recruit
  combat_value_targets
  leader_to_keep
  capture_villages
 
 all include an optional cost measure to define the evaluation score of the candidate action in the format cost=(cost value) an example is below
  
 movement cost 15000
 
 Goals are in the format
 goal is (type) value is (value) supplementary info
 valid types are protect leader, protect unit, attack, protect
 Protect leader requires the folliwng supplemntary info - radiius is (protection radius value) side is (side of unit to protect) ID/Type is (use ID or type and then put required info)
 protect leader requires radius is and side is 
 Protect Location needs x (x value) y (y value) and radius
 attack location requires x and y
 
 examples for location and leader can be found below
 
 goal is protext x 5 y 7 value is 3
 goal is protect leader value is 3 radius is 3
 goal is protect unit value is 3 radisu is 4 side is 1 ID is "bob"
 
 Examples for recruiting units can be found below. All recruit instructions conist of units, followed by a comma seperated list of unit names and optional values. The optional values are tunrs (the coma seperated list of what turns to have the recruit instruction run e.g. 1,5) importance (the importance of the recruit instruction) and number (the total number of units from the list to be recruited)
 recruit units Swordsman,Archer turns 3,8 importance 7 number 8
 
