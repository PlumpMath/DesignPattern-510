package com.latewind.pattern.behavioral.observer;

public class MobileObserver extends Observer {

	public MobileObserver(Reminder reminder) {
		super(reminder);
		
	}

	@Override
	public void update() {
		
		System.out.println("收到通知"+this.getClass()+reminder.getAction());
		//  Auto-generated method stub

	}

}
