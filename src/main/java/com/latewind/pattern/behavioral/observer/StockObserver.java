package com.latewind.pattern.behavioral.observer;

public class StockObserver extends Observer {

	public StockObserver(Reminder reminder) {
		super(reminder);
		
	}
	@Override
	public void update() {
		//  Auto-generated method stub
		System.out.println("收到通知"+reminder.getAction());

	}

}
