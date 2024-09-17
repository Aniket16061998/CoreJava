package com.te.true2java.basics;

class C {
	void m1() {

	}

}

class B extends C {

	void m2() {

	}

}

class Classcast extends B {
	public static void main(String[] args) {
		C c1 = new B();
		System.out.println("hi");

		Classcast c = (Classcast) c1;
		System.out.println("hi");

	}

	void m3() {

	}
}
