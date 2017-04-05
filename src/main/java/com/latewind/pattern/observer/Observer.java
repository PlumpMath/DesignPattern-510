package com.latewind.pattern.observer;

public abstract class Observer {
	protected Reminder reminder;
	
	public Observer(Reminder reminder) {
		
		this.reminder=reminder;
	}
	
	public abstract void update();
}
