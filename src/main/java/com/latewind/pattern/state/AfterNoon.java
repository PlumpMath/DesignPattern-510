package com.latewind.pattern.state;

public class AfterNoon implements TimeStatus {

	@Override
	public void done(EveryDay everyDay) {
		//  Auto-generated method stub
		
		int hour=	everyDay.getTime().getHour();
		if(hour>20){
			
			everyDay.setTimeStatus(new Night());
			
		}
		else{
		
		System.out.println("下午时间");
		}
	}

}
