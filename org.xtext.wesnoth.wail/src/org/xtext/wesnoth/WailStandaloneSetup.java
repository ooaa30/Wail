/*
 * generated by Xtext 2.22.0
 */
package org.xtext.wesnoth;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class WailStandaloneSetup extends WailStandaloneSetupGenerated {

	public static void doSetup() {
		new WailStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
