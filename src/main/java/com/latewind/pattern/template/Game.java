package com.latewind.pattern.template;

public abstract class Game {
	
	protected abstract void init();
	
	protected abstract void start();
	
	protected abstract void end();
	
	public void runGame(){
		
		
		init();
		start();
		end();
		
	}
	

}
