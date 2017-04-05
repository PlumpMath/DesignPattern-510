package com.latewind.pattern.proxy;

import java.util.Random;

public class ProxyPursure implements Pursure {
	private RealPursure pursure;
	
	public ProxyPursure(String mmName) {
		
		pursure=new RealPursure(mmName);
		
	}
	
	
	@Override
	public void giveFlower() {
		
		pursure.giveFlower();

	}

	@Override
	public void giveMoney() {
		Random random=new Random();
		if((random.nextInt()&1)!=0){
			
			pursure.giveMoney();
		}else{
			
			System.out.println("心情不好,钱没收");
		}
		
	}

}
