package asmlbuilder.builder;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.Enumerator;

import asmlbuilder.matching.AbstraticMatching;
import asmlbuilder.matching.ExternalModuleMatching;
import asmlbuilder.matching.FileMatching;
import asmlbuilder.matching.MetaClassMatching;
import asmlbuilder.matching.MetaModuleMatching;
import asmlbuilder.matching.ModuleMatching;
import asmlbuilder.restriction.ComponentAAccessCompontB;
import asmlbuilder.restriction.ComponentACreateCompontB;
import asmlbuilder.restriction.ComponentAExtendsCompontB;
import asmlbuilder.restriction.ComponentAHandleCompontB;
import asmlbuilder.restriction.ComponentARequiresCompontB;
import asmlbuilder.restriction.RestricionChecker;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.Module;
import br.ufmg.dcc.asml.aSMLModel.RelactionType;
import br.ufmg.dcc.asml.aSMLModel.Restriction;
import br.ufmg.dcc.asml.aSMLModel.impl.ExternalModuleImpl;
import br.ufmg.dcc.asml.aSMLModel.impl.FileImpl;
import br.ufmg.dcc.asml.aSMLModel.impl.MetaClassImpl;
import br.ufmg.dcc.asml.aSMLModel.impl.MetaModuleImpl;
import br.ufmg.dcc.asml.aSMLModel.impl.ModuleImpl;

public class ASMLBinder {
	private Map<Class<? extends AbstractComponent>, AbstraticMatching> bindMatching = new HashMap<Class<? extends AbstractComponent>, AbstraticMatching>();
	private Map<AbstractComponent, AbstraticMatching> bindMatchingCustom = new HashMap<AbstractComponent, AbstraticMatching>();

	private Map<Enumerator, RestricionChecker> bindRestrictionChecker = new HashMap<Enumerator, RestricionChecker>();
	private Map<Restriction, RestricionChecker> bindRestrictionCheckerCustom = new HashMap<Restriction, RestricionChecker>();

	public ASMLBinder(ASMLContext asmlContext){
		bindMatching.put(ModuleImpl.class, new ModuleMatching(asmlContext));
		bindMatching.put(MetaModuleImpl.class, new MetaModuleMatching(asmlContext));
		bindMatching.put(ExternalModuleImpl.class, new ExternalModuleMatching(asmlContext));
		bindMatching.put(FileImpl.class, new FileMatching(asmlContext));
		bindMatching.put(MetaClassImpl.class, new MetaClassMatching(asmlContext));
		bindMatching.put(Module.class, new ModuleMatching(asmlContext));
		
		bindRestrictionChecker.put(RelactionType.REQUIRES, new ComponentARequiresCompontB(asmlContext));
		bindRestrictionChecker.put(RelactionType.EXTEND, new ComponentAExtendsCompontB(asmlContext));
		bindRestrictionChecker.put(RelactionType.HANDLE, new ComponentAHandleCompontB(asmlContext));
		bindRestrictionChecker.put(RelactionType.CREATE, new ComponentACreateCompontB(asmlContext));
		bindRestrictionChecker.put(RelactionType.ACCESS, new ComponentAAccessCompontB(asmlContext));
	}
	public Map<AbstractComponent, AbstraticMatching> getBindMatchingCustom() {
		return bindMatchingCustom;
	}
	public Map<Class<? extends AbstractComponent>, AbstraticMatching> getBindMatching() {
		return bindMatching;
	}
	
	public Map<Enumerator, RestricionChecker> getBindRestrictionChecker() {
		return bindRestrictionChecker;
	}
	public Map<Restriction, RestricionChecker> getBindRestrictionCheckerCustom() {
		return bindRestrictionCheckerCustom;
	}

}
