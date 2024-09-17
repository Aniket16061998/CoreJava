package com.te.true2java.basics;

import java.util.Objects;

class test{
	String name;

	public test(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		test other = (test) obj;
		return Objects.equals(name, other.name);
	}

//	@Override
//	public String toString() {
//		return "test [name=" + name + "]";
//	}
//	
}

 class Demo{
	 
	 public static void main(String[] args) {
		test test = new test("10");
		test test1 = new test("Ashish");
		System.out.println(test.equals(test1));
	}

	
}

