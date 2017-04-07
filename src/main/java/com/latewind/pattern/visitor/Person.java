package com.latewind.pattern.visitor;

public interface Person {
	void accept(Visitor visitor);
	
	void answer();
	
}
