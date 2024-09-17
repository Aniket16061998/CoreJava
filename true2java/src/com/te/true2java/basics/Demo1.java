package com.te.true2java.basics;

class Demo1 {
	public static void main(String[] args) {
		System.out.println(Integer.BYTES);

	}
}
@FunctionalInterface
interface A1 {
	void m1();
}

@FunctionalInterface
interface B1 extends A1 {
	

}
