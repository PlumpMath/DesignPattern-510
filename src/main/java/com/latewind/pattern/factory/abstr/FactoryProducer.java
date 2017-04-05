package com.latewind.pattern.factory.abstr;

public class FactoryProducer {
	
	public static AbstractFactory getStockFactory(){
		
		return new StockFactory();
	}
	
	public static AbstractFactory getHouseFactory(){
		
		return new HouseFactory();
	}

}
