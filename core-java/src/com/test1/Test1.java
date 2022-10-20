package com.test1;

class A extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class Test1 {
public static void main(String[] args) {
	A t1=new A();
	A t2=new A();
	A t3=new A();
	t1.setName("Thread-1");
	t2.setName("Thread-2");
	t3.setName("Thread-3");
	t1.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	t2.start();

	t3.start();
	t2.stop();
}
}
