package com.ust.thread;

//class MyThread extends Thread{
class MyThread implements Runnable{
	public void run() {
		
	}
}
public class ThreadDemo {
public static void main(String[] args) throws InterruptedException {
	for(int i=0;i<10;i++) {
		Thread.sleep(1000);
		System.out.println(i);
	}
}
}
