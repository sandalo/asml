/*
* generated by Xtext
*/
package br.ufmg.dcc.asml;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ASMLModelUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return br.ufmg.dcc.asml.ui.internal.ASMLModelActivator.getInstance().getInjector("br.ufmg.dcc.asml.ASMLModel");
	}
	
}