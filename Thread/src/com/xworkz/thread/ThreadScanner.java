package com.xworkz.thread;

public class ThreadScanner {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("before sleep");
		
		Thread thread = new MyThread();
		thread.start();
		
		Thread thread1 = new MyThread();
		thread1.start();
		for (int i = 0; i < 5; i++) {
			Thread.sleep(2000);
			System.out.println("after main sleep for 2 sec");
		}
		System.out.println("after sleep");
	}

}
