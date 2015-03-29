package br.ufmg.dcc.asml;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.CompilationUnit;

import br.ufmg.dcc.asml.aSMLModel.AbstractComponent;

public class ASMLResource implements Comparable<ASMLResource> {
	private IResource resource;
	private final Set<AbstractComponent> components = new HashSet<AbstractComponent>();
	private Map<Class<? extends ASTNode>, Set<ASMLASTNode>> instancesOfAstNodes = new HashMap<Class<? extends ASTNode>, Set<ASMLASTNode>>();
	private CompilationUnit compilationUnitAST;
	private ICompilationUnit compilationUnitType;

	public CompilationUnit getCompilationUnitAST() {
		return compilationUnitAST;
	}

	public void setCompilationUnitAST(CompilationUnit compilationUnit) {
		this.compilationUnitAST = compilationUnit;
	}
	
	public IResource getResource() {
		return resource;
	}

	public void setResource(IResource resource) {
		this.resource = resource;
	}

	public Set<AbstractComponent> getComponents() {
		return Collections.unmodifiableSet(components);
	}

	public void addComponents(AbstractComponent component) {
		this.components.add(component);
	}

	public void componentClear() {
		components.clear();
	}

	public void componentRemove(AbstractComponent component) {
		components.remove(component);
	}

	@Override
	public int compareTo(ASMLResource o) {
		if (resource != null && o.getResource() != null)
			return resource.getFullPath().toString().compareTo(o.getResource().getFullPath().toString());
		return -1;
	}

	@Override
	public String toString() {
		if (resource != null)
			return resource.toString();
		return "undefined";
	}


	public boolean addInstancesOfASTNodeJavaFound(ASMLASTNode astNode) {
		Class<? extends ASTNode> classOfNode = astNode.getAstNode().getClass();
		boolean add = false;
		Set<ASMLASTNode> astNodes = (Set<ASMLASTNode>) instancesOfAstNodes.get(classOfNode);
		if (astNodes == null) {
			astNodes = new HashSet<ASMLASTNode>();
			instancesOfAstNodes.put(classOfNode, astNodes);
		}
		add = astNodes.add(astNode);
		return add;
	}

	public Set<ASMLASTNode> getASTNodeByType(Class<? extends ASTNode> classOfNode) {
		Set<ASMLASTNode> astNodes = instancesOfAstNodes.get(classOfNode);
		if (astNodes != null)
			return Collections.unmodifiableSet(astNodes);
		return new HashSet<ASMLASTNode>();
	}

	public ICompilationUnit getCompilationUnitType() {
		return compilationUnitType;
	}

	public void setCompilationUnitType(ICompilationUnit compilationUnitType) {
		this.compilationUnitType = compilationUnitType;
	}

}
