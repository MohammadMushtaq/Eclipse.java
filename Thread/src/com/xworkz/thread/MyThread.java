package com.xworkz.thread;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println("running my thread");
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(3000);
				System.out.println("after sleep in 3 sec"+getName());
			}
			System.out.println("after mythread sleep");
		} catch (Exception e) {
			e.fillInStackTrace();
		}
		super.run();
	}
		



}
