package com.te.true2java.trycatch;

public class TryCatchDemo1 {
	
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(Throwable t) {
			System.out.println("hi");
		}
		
		
	}

}
