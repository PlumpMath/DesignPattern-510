package com.latewind.pattern.structural.decorator;

public class WindowDecorator extends StructDecorator {
	@Override
	public void display(){
		System.out.println("窗户");
		house.display();
	}

}
