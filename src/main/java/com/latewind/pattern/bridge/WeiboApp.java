package com.latewind.pattern.bridge;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class WeiboApp implements App {
	private String name;
	@Override
	public void run(String phone) {
		System.out.println(phone+"微博在运行");
		//  Auto-generated method stub
	}

}
