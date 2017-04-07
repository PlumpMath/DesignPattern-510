package com.latewind.pattern.visitor;

public class Citizen implements Person {

	@Override
	public void accept(Visitor visitor) {
		visitor.vistit(this);
	}

	@Override
	public void answer() {
		System.out.println("I'm an Citizen ,I live in NewYork");
	}

}
