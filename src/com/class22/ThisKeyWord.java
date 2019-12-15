package com.class22;

public class ThisKeyWord {
	//
	
	int a,b;
	public ThisKeyWord(int a, int b) {
		this.a=a;
		this.b=b;
	}
		public ThisKeyWord() {
			System.out.println(" I'm none argument constructor");
		}
		
	
public void sum(int a ,int b) {
	System.out.println("The sum of local parameter is "+( a+b));
	System.out.println(" The sum of instance variable is "+( this.a+this.b));
	
}
public void sayA() {
	System.out.println(a);
}
public void sayB() {
	System.out.println(b);
}
public void  sayAsayB(){
	this.sayA();
	sayB();//  If we didnt use this keyWord compiler adds this automatically --> this.sayB();
}
public static void main(String[] args) {
	ThisKeyWord obj= new ThisKeyWord(5,10);
	obj.sum(10,20);
	
	ThisKeyWord obj1= new ThisKeyWord();
	obj.sum(100, 200);
	obj.sayA();
	obj.sayB();
	System.out.println("************************************************************************");
   obj.sayAsayB();

}


}
