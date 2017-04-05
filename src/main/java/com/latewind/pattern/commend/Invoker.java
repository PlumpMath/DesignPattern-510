package com.latewind.pattern.commend;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Invoker {
	private Set<Commend> commends=new HashSet<>();
	
	public void executeCmd(Commend commend){
		commends.add(commend);
		commend.execute();
	} 
	
}
