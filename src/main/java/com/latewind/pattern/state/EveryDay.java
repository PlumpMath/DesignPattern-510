package com.latewind.pattern.state;

import java.time.LocalDateTime;

public class EveryDay implements StateContext {
	private LocalDateTime time;
	
	private TimeStatus timeStatus;
	
	public EveryDay(LocalDateTime date) {
		this.time = date;
		timeStatus = new Moring();
	}
	
	public void done(){
		
		timeStatus.done(this);
		
	}
	
	
	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public TimeStatus getTimeStatus() {
		return timeStatus;
	}

	public void setTimeStatus(TimeStatus timeStatus) {
		this.timeStatus = timeStatus;
	}

}
