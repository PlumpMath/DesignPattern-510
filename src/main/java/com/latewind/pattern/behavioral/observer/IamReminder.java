package com.latewind.pattern.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

public class IamReminder implements Reminder {
	private List<Observer> observers=new LinkedList<>();
	private String action="大家注意力";
	
	@Override
	public void notice() {
		
		for(Observer observer:observers){
			
			observer.update();
		}
		
		//  Auto-generated method stub

	}

	@Override
	public void attach(Observer observer) {
		//  Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void remove() {
		//  Auto-generated method stub

	}

	@Override
	public String getAction() {
		//  Auto-generated method stub
		return this.action;
	}

}
