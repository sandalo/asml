package asmlbuilder.builder;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.internal.core.ClassFile;

import asmlbuilder.classloader.ASMLClassLoader;
import asmlbuilder.matching.AbstraticMatching;
import br.ufmg.dcc.asml.ComponentInstance;
import br.ufmg.dcc.asml.aSMLModel.ASMLModel;
import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;
import br.ufmg.dcc.asml.aSMLModel.View;

public class ASMLContext {
	private static final Logger log = Logger.getLogger(ASMLContext.class.getName());
	private ASMLClassLoader classLoader;
	private long timeStampResource;
	private final Set<ComponentInstance> componentInstances = new TreeSet<ComponentInstance>();
	// private final Set<ComponentInstance> externalComponentInstances = new
	// TreeSet<ComponentInstance>();
	private ASMLModel asmlModel;
	private Set<ASMLModel> otherAsmlModelReferenced = new HashSet<ASMLModel>();
	private IJavaProject javaProject;
	private ASMLReosurceJavaVisitor reosurceJavaVisitor;
	private IClasspathContainer classpathMavenContainer;
	private ASMLResourceVisitor resourceVisitor;
	private ASMLResourceDeltaVisitor resourceDeltaVisitor;
	private ASMLBinder asmlBinder = new ASMLBinder(this);
	private Map<String, AbstractComponent> sufixAndPrefixNameConvention = new HashMap<String, AbstractComponent>();
	private Map<String, AbstractComponent> packageMathing = new HashMap<String, AbstractComponent>();
	/*
	 * private Map<String, IClassFile> classFilesByFullyQualifiedName = new
	 * HashMap<String, IClassFile>(); private Map<String, Set<IClassFile>>
	 * classFilesByPackageName = new HashMap<String, Set<IClassFile>>();
	 */
	// private final Set<AbstractComponent> declaredComponents = new
	// HashSet<AbstractComponent>(100);

	private List<Violation> violations = new ArrayList<Violation>();

	// private Map<MetaClass, Set<MetaClass>> sublMetaClasses = new
	// HashMap<MetaClass, Set<MetaClass>>(100);

	class ResourceComparator implements Comparator<IResource> {
		@Override
		public int compare(IResource o1, IResource o2) {
			return o1.getFullPath().toString().compareTo(o2.getFullPath().toString());
		}
	}

	public AbstractComponent getComponentByName(String name) {
		for (AbstractComponent abstractComponent : asmlModel.getAllComponents()) {
			if (abstractComponent.getName().equals(name)) {
				return abstractComponent;
			}
		}
		return null;
	}

	public boolean existInstancesOfComponentWithName(String resourcetName, String componentName) {
		AbstractComponent componentByName = getComponentByName(componentName);
		if (componentByName == null)
			return false;
		ComponentInstance instanceByName = getInstanceByName(componentByName, resourcetName);
		if (instanceByName != null)
			return true;
		return false;
	}

	public ComponentInstance getInstanceByName(AbstractComponent abstractComponent, String name) {
		if (abstractComponent == null)
			return null;
		Set<ComponentInstance> list = abstractComponent.getInstances();
		if (list == null)
			return null;
		for (ComponentInstance iResource : list) {
			String nomeDoRecursoSemExtencao = deleteExtension(iResource.getResource());
			name = deleteExtension(name);
			if (nomeDoRecursoSemExtencao.equalsIgnoreCase(name)) {
				return iResource;
			}
		}
		return null;
	}

	private String deleteExtension(IResource iResource) {
		String name = iResource.getName();
		return deleteExtension(name);
	}

	private String deleteExtension(String name) {
		return name.replace(".java", "").replace(".txt", "").replace(".xml", "").replace(".zul", "").replace(".js", "").replace(".html", "");
	}

	public Set<ComponentInstance> getComponentInstances() {
		return Collections.unmodifiableSet(componentInstances);
	}

	/*
	 * public void addExternalComponentInstance(ComponentInstance
	 * componentInstance) { //
	 * System.out.println(componentInstance.getResource().getName());
	 * externalComponentInstances.add(componentInstance); }
	 * 
	 * public void removeExternalComponentInstance(ComponentInstance
	 * componentInstance) {
	 * externalComponentInstances.remove(componentInstance); }
	 * 
	 * public void clearExternalResource() { externalComponentInstances.clear();
	 * }
	 * 
	 * public Set<ComponentInstance> getExternalComponentInstances() { return
	 * Collections.unmodifiableSet(externalComponentInstances); }
	 */

	public void addComponentInstance(ComponentInstance componentInstance) {
		componentInstances.add(componentInstance);
	}

	public void removeComponentInstance(ComponentInstance componentInstance) {
		componentInstances.remove(componentInstance);
	}

	public void clearResource() {
		componentInstances.clear();
	}

	public List<Violation> getViolations() {
		return violations;
	}

	public ASMLModel getAsmlModel() {
		return asmlModel;
	}

	public void setAsmlModel(ASMLModel asmlModel) {
		this.asmlModel = asmlModel;
		EList<EObject> contents = asmlModel.eResource().getContents();
		for (int i = 1; i < contents.size(); i++) {
			this.otherAsmlModelReferenced.add((ASMLModel) contents.get(i));
		}
	}

	public IJavaProject getJavaProject() {
		return javaProject;
	}

	public void setJavaProject(IJavaProject javaProject) {
		this.javaProject = javaProject;
	}

	public ASMLReosurceJavaVisitor getReosurceJavaVisitor() {
		return reosurceJavaVisitor;
	}

	public void setReosurceJavaVisitor(ASMLReosurceJavaVisitor reosurceJavaVisitor) {
		this.reosurceJavaVisitor = reosurceJavaVisitor;
	}

	public IClasspathContainer getClasspathMavenContainer() {
		return classpathMavenContainer;
	}

	public void setClasspathMavenContainer(IClasspathContainer classpathMavenContainer) {
		this.classpathMavenContainer = classpathMavenContainer;
	}

	public ASMLResourceVisitor getResourceVisitor() {
		return resourceVisitor;
	}

	public void setResourceVisitor(ASMLResourceVisitor resourceVisitor) {
		this.resourceVisitor = resourceVisitor;
	}

	public ASMLResourceDeltaVisitor getResourceDeltaVisitor() {
		return resourceDeltaVisitor;
	}

	public void setResourceDeltaVisitor(ASMLResourceDeltaVisitor resourceDeltaVisitor) {
		this.resourceDeltaVisitor = resourceDeltaVisitor;
	}

	public AbstraticMatching getMatching(AbstractComponent abstractComponent) {
		if (getAsmlBinder().getBindMatchingCustom().containsKey(abstractComponent)) {
			return getAsmlBinder().getBindMatchingCustom().get(abstractComponent);
		}
		return getAsmlBinder().getBindMatching().get(abstractComponent.getClass());
	}

	public void addMatchingCustom(AbstractComponent abstractComponent) {
		AbstraticMatching abstraticMatching = null;
		String nameClass = getComponentFullName(abstractComponent);
		abstraticMatching = loadMatchingCustomClass(nameClass + ".matching.MetaModuleMatching_" + abstractComponent.getName());
		if (abstraticMatching != null)
			getAsmlBinder().getBindMatchingCustom().put(abstractComponent, abstraticMatching);
	}

	private String getComponentFullName(AbstractComponent abstractComponent) {
		String nameClass = abstractComponent.getName();
		EObject parent = abstractComponent.eContainer();
		while (parent != null) {
			if (parent instanceof View)
				nameClass = ((View) parent).getName() + "." + nameClass;
			if (parent instanceof ASMLModel)
				nameClass = "undefined";
			if (parent instanceof AbstractComponent)
				nameClass = ((AbstractComponent) parent).getName() + "." + nameClass;
			parent = parent.eContainer();
		}
		return nameClass;
	}

	private AbstraticMatching loadMatchingCustomClass(String nameClass) {
		AbstraticMatching abstraticMatching = null;
		try {
			Class<?> loadClass = classLoader.loadClass(nameClass);
			if (loadClass != null) {
				Constructor<?> constructor = loadClass.getConstructor(ASMLContext.class);
				abstraticMatching = (AbstraticMatching) constructor.newInstance(this);
			}
		} catch (Exception e) {
			// System.out.println("controlado...");
		}
		return abstraticMatching;
	}

	public ASMLClassLoader getClassLoader() {
		return classLoader;
	}

	public void setClassLoader(ASMLClassLoader classLoader) {
		this.classLoader = classLoader;
	}

	public void clearAll() {
		componentInstances.clear();
		violations.clear();
	}

	/*
	 * public Map<MetaClass, Set<MetaClass>> getSublMetaClasses() { return
	 * sublMetaClasses; }
	 */

	public ASMLBinder getAsmlBinder() {
		return asmlBinder;
	}

	public void setAsmlBinder(ASMLBinder asmlBinder) {
		this.asmlBinder = asmlBinder;
	}

	public static EList<AbstractComponent> getComponentsChildren(AbstractComponent abstractComponent) {
		return abstractComponent.getComponents();
	}

	public long getTimeStampResource() {
		return timeStampResource;
	}

	public void setTimeStampResource(long timeStampResource) {
		this.timeStampResource = timeStampResource;
	}

	/*
	 * public Set<ComponentInstance> getResourcesMatchedInStaticAnalysis() {
	 * Set<ComponentInstance> resourcesMatchedInStaticAnalysis = new
	 * HashSet<ComponentInstance>(); for (AbstractComponent abstractComponent :
	 * declaredComponents) {
	 * resourcesMatchedInStaticAnalysis.addAll(abstractComponent
	 * .getInstances()); } return resourcesMatchedInStaticAnalysis; }
	 */

	public List<AbstractComponent> getDeclaredComponents() {
		return Collections.unmodifiableList(this.asmlModel.getAllComponents());
	}

	public void addMatchNameConvention(AbstractComponent abstractComponent) {
		addSufixAndPrefixNameConvention(abstractComponent);
		addPackageMathing(abstractComponent);
	}

	private void addPackageMathing(AbstractComponent abstractComponent) {
		String matching = abstractComponent.getMatching();
		if (matching == null)
			return;
		if (matching.contains(".*")) {
			matching = matching.replaceAll("\\.\\*", "");
			packageMathing.put(matching, abstractComponent);
		} else {
			String[] segments = matching.split("\\.");
			String matchingAux = "";
			for (int i = 0; i < segments.length - 1; i++) {
				matchingAux = matchingAux + "." + segments[i];
			}
			if (!matchingAux.equals(""))
				packageMathing.put(matchingAux.substring(1), abstractComponent);
		}
	}

	private void addSufixAndPrefixNameConvention(AbstractComponent abstractComponent) {
		String matching = abstractComponent.getMatching();
		if (matching != null) {
			if (matching.contains("?")) {
//				token = matching.replaceAll("\\{\\?\\}", "").replaceAll("\\{index\\}", "");
				String sufixAndPrefixNames[] = matching.split("\\{\\?\\}");
				if(sufixAndPrefixNames.length>0){
					//No momento trata apenas colisão de prefixos. Ex. VO => BaseVO
					sufixAndPrefixNameConvention.put(sufixAndPrefixNames[sufixAndPrefixNames.length-1], abstractComponent);
				}
			}
		}
	}

	/*
	 * public void clearDeclaredComponents() { declaredComponents.clear(); }
	 */

	public void clearSufixAndPrefixNameConventionConvention() {
		sufixAndPrefixNameConvention.clear();
	}

	public Set<String> getSufixAndPrefixNameConventionConvention() {
		return Collections.unmodifiableSet(sufixAndPrefixNameConvention.keySet());
	}

	public Set<String> getPackagesMathing() {
		return Collections.unmodifiableSet(packageMathing.keySet());
	}

	/*
	 * public void addClassFile(String packageName, IClassFile classFile) {
	 * //isere no mapa por qualifiedName
	 * classFilesByFullyQualifiedName.put(classFile
	 * .getType().getFullyQualifiedName(), classFile); //isere no mapa por
	 * package Set<IClassFile> classFiles =
	 * classFilesByPackageName.get(packageName); if(classFiles == null){
	 * classFiles = new HashSet<IClassFile>();
	 * classFilesByPackageName.put(packageName, classFiles); }
	 * classFiles.add(classFile); }
	 * 
	 * public IClassFile getClassFileByFullName(String fullName){ return
	 * classFilesByFullyQualifiedName.get(fullName); }
	 */

	/*
	 * public Set<IClassFile> getClassFileByPackageName(String pck){ return
	 * Collections.unmodifiableSet(classFilesByPackageName.get(pck)); }
	 */

	public Set<ASMLModel> getOtherAsmlModelReferenced() {
		return Collections.unmodifiableSet(otherAsmlModelReferenced);
	}
}
