package asmlbuilder.builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

public class ASTJavaParser {

	private ASMLReosurceJavaVisitor asmlReosurceJavaVisitor;
	public ASTJavaParser(ASMLReosurceJavaVisitor asmlReosurceJavaVisitor) {
		this.asmlReosurceJavaVisitor = asmlReosurceJavaVisitor;
	}
	

	// use ASTParse to parse string
	public void parse(IFile iFile, CacheASML cacheASML) {
		java.io.File file = new java.io.File(iFile.getLocation().toOSString());
		String str = readFileToString(file);
		ASTParser parser = ASTParser.newParser(AST.JLS8);
		parser.setSource(str.toCharArray());
		parser.setKind(ASTParser.K_COMPILATION_UNIT);
		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		
		ASMLASTNode asmlastNode = new ASMLASTNode();
		asmlastNode.setResource(iFile);
		asmlastNode.setCompilationUnit(cu);
		asmlReosurceJavaVisitor.setAsmlastNode(asmlastNode);
		
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
				System.out.println(numRead);
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