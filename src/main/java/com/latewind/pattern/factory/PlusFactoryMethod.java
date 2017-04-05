package com.latewind.pattern.factory;

public class PlusFactoryMethod implements IFactoryMethod {

	@Override
	public  Operation getOperation() {
		//  Auto-generated method stub
		return new PlusOperation();
	}

}
