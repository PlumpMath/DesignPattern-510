package com.latewind.pattern.mediator;

public class OrdMember extends Member{

	public OrdMember(Mediator mediator,String name) {
		super(mediator, name);
		
	}

	@Override
	public void send(String message) {
		//  Auto-generated method stub
		System.out.println(name+"发送了"+message);
		mediator.viewMsg(message);
	}
	

}
