package com.class28;

public abstract class AbstractTask {
	// Create a class File that will have the following behaviors: 
	//open, edit, close. Edit and close are implemented method while open is an abstract.
	//Create 3 subclasses: JavaFile, WordFile, PDFFile that will
	//provide specific implementation of open behaviour: Example: to open .
	//java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
	
public void edit () {
	System.out.println(" Edit a file");
}
public void close() {
	System.out.println(" Close the file");
}
public abstract void open();
}

class JavaFile extends AbstractTask{

	@Override
	public void open() {
		System.out.println(" java file we need notepad++ ");
		
	}}
	class WordFile extends AbstractTask{

		@Override
		public void open() {
			System.out.println("Open the WorldFile to open, we need Microsoft word to be installed ");
			
		}}
		class PDFFile extends AbstractTask{

			@Override
			public void open() {
				System.out.println("Open the WorldFile to open, we need Microsoft word to be installed ");
				
			}
			
		}
	

	