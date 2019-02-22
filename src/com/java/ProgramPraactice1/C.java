package com.java.ProgramPraactice1;

import com.java.A;

public class C extends A {

	/*void sample(A a) {
		System.out.println("Sample method");
		a.test1();
	}*/
	
public static void main(String[] args) {
	
	
	A aref=new A();
	
	C cref=new C();
	cref.methodOne();
	
	A acref1=new C();
	
}
	
}
