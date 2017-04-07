package com.latewind.pattern.visitor;

public class Interviewer implements Visitor{

	@Override
	public void visit(Chairman chairman) {
		System.out.println("This is the :" +chairman.getClass().getSimpleName());	
		
			chairman.answer();
	}

	@Override
	public void vistit(Citizen citizen) {
		System.out.println("This is the :" +citizen.getClass().getSimpleName());	
		citizen.answer();
	}


	
}
