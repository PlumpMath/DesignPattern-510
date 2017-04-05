package com.latewind.pattern.decorator;

public class DoorDecorator extends StructDecorator {
	
	public void decorator(House decorator) {
		this.house=decorator;
	};
	
	@Override
	public void display(){
		System.out.println("门");
		house.display();
	}

}
