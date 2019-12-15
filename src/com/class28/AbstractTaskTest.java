package com.class28;

public class AbstractTaskTest {
	public static void main(String[] args) {
		

	
	AbstractTask  javaFile= new  JavaFile() ;
	javaFile.close();
	javaFile.edit();
	javaFile.open();
	
	AbstractTask WordFile=new WordFile();
	WordFile.close();
	WordFile.edit();
	WordFile.open();
	
	AbstractTask PDFFile= new PDFFile();
	PDFFile .close();
	PDFFile.edit();
	PDFFile.open();
	
	

}
}