package com.te.true2java.flow;

class B{
	
	static {
		System.out.println("static");
	}
	{
		System.out.println("Non static");
	}
	
	
}

public class checkTheFlow {
	public static void main(String[] args) {
//		B b;
		System.out.println("HI");
		new B();
	}

}
