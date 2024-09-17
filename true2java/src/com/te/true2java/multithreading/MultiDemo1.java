package com.te.true2java.multithreading;

class MultiDemo1 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}

class MyThread1 extends Thread{
	@Override
	public void run() {
		Thread.currentThread().setName("Preeti");
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}
