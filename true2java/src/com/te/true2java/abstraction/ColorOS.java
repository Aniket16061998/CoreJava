package com.te.true2java.abstraction;

public class ColorOS implements AndroidOS {

	@Override
	public void takePictur() {
		System.out.println("ColorOS Takepicture");

	}

	@Override
	public void optimizeBattery() {
		System.out.println("ColorOS optimizeBattery");
	}

	@Override
	public void nightPhotography() {
		System.out.println("ColorOS optimizeBattery");
	}

}
