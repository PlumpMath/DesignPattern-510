package com.latewind.pattern.factory.abstr;

import com.latewind.pattern.decorator.House;
import com.latewind.pattern.facade.Stock;

public abstract class AbstractFactory {
	
	public abstract House getHouse(String house);
	
	public abstract Stock getStock(String stock);

}
