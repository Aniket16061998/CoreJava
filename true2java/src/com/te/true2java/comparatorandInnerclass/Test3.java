package com.te.true2java.comparatorandInnerclass;

public class Test3 extends Test1 {
	@Override
	void m1() {
		System.out.println("Hi from test2");

	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}

}

class Test {
	void m1() {
		System.out.println("HI");
	}
}

abstract class Test1 extends Test {
	abstract void m1();
}
