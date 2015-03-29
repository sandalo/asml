package asmlbuilder.builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import br.ufmg.dcc.asml.ASMLResource;

public class ASTJavaParser {

	private ASMLReosurceJavaVisitor asmlReosurceJavaVisitor;
	public ASTJavaParser(ASMLReosurceJavaVisitor asmlReosurceJavaVisitor) {
		this.asmlReosurceJavaVisitor = asmlReosurceJavaVisitor;
	}
	

	// use ASTParse to parse string
	public void parse(ASMLResource asmlResource) {
		ICompilationUnit element = (ICompilationUnit) JavaCore.create(asmlResource.getResource());
		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setSource(element);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		parser.setResolveBindings(true);
		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		asmlResource.setCompilationUnitAST(cu);
		asmlResource.setCompilationUnitType(element);
		asmlReosurceJavaVisitor.setAsmlResource(asmlResource);
		
		cu.accept(asmlReosurceJavaVisitor);
	}

	// read file content into a string
	public String readFileToString(File file) {
		StringBuilder fileData = new StringBuilder(1000);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			char[] buf = new char[10];
			int numRead = 0;
			while ((numRead = reader.read(buf)) != -1) {
				String readData = String.valueOf(buf, 0, numRead);
				fileData.append(readData);
				buf = new char[1024];
			}
			reader.close();
		} catch (Exception e) {
			e.fillInStackTrace();
		}
		return fileData.toString();
	}
}