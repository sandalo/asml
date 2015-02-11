package br.ufmg.dcc.asml.scoping;

import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

public class ASMLImportUriGlobalScopeProvider extends ImportUriGlobalScopeProvider {

	@Override
	protected LinkedHashSet<URI> getImportedUris(final Resource resource) {
		LinkedHashSet<URI> temp = super.getImportedUris(resource);
		temp.add(URI.createURI("vaccine2.asml"));
		return temp;
	}
}