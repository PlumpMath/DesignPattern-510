package com.latewind.pattern.mediator;

public class ChatRoom extends Mediator {

	@Override
	public void viewMsg(String message) {
		//  Auto-generated method stub
		for(Member member : members){
			member.getMsg(message);
		}
	}

}
