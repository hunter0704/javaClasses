package com.class30;

	// create an Interface 'Shape' with undefine methods 
	//as calculateArea and caculatePerimiter
	// create 2 child classes 
	//Circle & Square that should have an implementation
	//of area and perimeter caculation.Test your code
	
	interface Shape{
		void calculateArea(double num);
		void caculatePerimiter(double num);
	}
	class Circle implements Shape{
		@Override
		public void calculateArea(double num) {
			System.out.println(3.14*(num*num));
			
		}

		@Override
		public void caculatePerimiter(double num) {
			System.out.println((3.14*2)+num);
			
		}
	}
	class Square implements Shape{

		@Override
		public void calculateArea(double num) {
			System.out.println(num*num);
			
		}

		@Override
		public void caculatePerimiter(double num) {
			System.out.println(num*4);
			
		}
		
	}
	public class ShapeTest {
	public static void main(String[] args) {
		Shape shape=new Circle();
		shape.calculateArea(10);
		shape.caculatePerimiter(10);
		
		Shape shape1=new Square();
		shape1.calculateArea(10);
		shape1.caculatePerimiter(10);
	

	}

}

	
