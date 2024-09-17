package com.te.true2java.abstraction;

public interface AndroidOS {
	void takePictur();

	void optimizeBattery();

	void nightPhotography();

	 default void m1() {
		System.out.println("HI");
	}
	
	 private static void prime() {
		 System.out.println("hi");
	 }

}
