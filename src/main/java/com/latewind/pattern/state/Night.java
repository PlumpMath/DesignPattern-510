package com.latewind.pattern.state;

public class Night implements TimeStatus {

	@Override
	public void done(EveryDay everyDay) {
		
		
		int hour=	everyDay.getTime().getHour();
		if(hour>7){
			
			everyDay.setTimeStatus(new Moring());
		}
		else{
	
		System.out.println("晚上休息");
		}
		
	}
		//  Auto-generated method stub

	}


