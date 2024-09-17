package com.te.true2java.defaultmethodininterface;

interface A2 {
	
	default void m() {
		System.out.println("hi");
	}

}
abstract interface A3 {
	 default void m() {
		System.out.println("byei");
	}

}

class A1 implements A2,A3{
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.m();
	}

	@Override
	public void m() {
		
		A3.super.m();
	}

	
}

