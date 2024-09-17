package com.te.true2java.optional;

public class Java14 {

	public static void main(String[] args) {
		Object animal = new Cat();
		if (animal instanceof Cat cat) {
			cat.meow();
		} else if (animal instanceof Dog dog) {
			dog.woof();
		}	}

}

class Animal {}
class Dog{

	public void woof() {
		System.out.println("dog");
	}
}
class Cat {

	public void meow() {
		System.out.println("cat");
	}

}
