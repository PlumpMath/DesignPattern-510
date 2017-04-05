package com.latewind.pattern.factory;

public class SimpleFactory {

	public static Operation getOperation(String operation){
						
		switch(operation){
		case "+":
			return new PlusOperation();
		case "-":
			return new MinusOperation();
		
		}
		return null;
	}
	
	
}
