package com.Class9;

public class NestedForLoopPatern {
public static void main (String[]args) {
	
//123456789
//for(int i=1;i<5; i++) {
//	for ( int a=1;a<10;a++) {
//System.out.print(a);
//	}
//	
//	System.out.println();
//	
//	
//	
//}
for (int i=5; i>=1; i--) {
	for (int b=5; b>=1;b--) {
		System.out.print(b);
	}

System.out.println();
}

for(int a=5; a>=1;a--) {
	for(int c=5;c>=1; c--) {
		System.out.print(a);
	}
System.out.println();
}


}
}