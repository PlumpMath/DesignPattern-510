package com.latewind.pattern.observer;

public interface Reminder {
	
	

	public void notice();
	
	public void attach(Observer observer);
	
	public void  remove();
	
	public String  getAction();
}
