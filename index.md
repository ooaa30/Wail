## Welcome to Wail

Wail is a Domain Specific language for modelling the AI in the game Battle for Wesnoth.

Wail was developed for a Final Year project and uses Xtext to aid in this process.

To install the project, simply download a zip of the whole project and import the plugin found within the wailplugin file. This should then give you access to the whole of the language and associated tooling.

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
	goal is x 5 y 5 value is 1
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
