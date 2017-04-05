package com.latewind.pattern.decorator;

public class WindowDecorator extends StructDecorator {
	@Override
	public void display(){
		System.out.println("窗户");
		house.display();
	}

}
