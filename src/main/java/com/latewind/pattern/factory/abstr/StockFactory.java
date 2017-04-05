package com.latewind.pattern.factory.abstr;

import com.latewind.pattern.decorator.Bungalow;
import com.latewind.pattern.decorator.House;
import com.latewind.pattern.facade.Astock;
import com.latewind.pattern.facade.Hstock;
import com.latewind.pattern.facade.Stock;

public class StockFactory extends AbstractFactory{

	@Override
	public House getHouse(String house) {
		
		
		
		return null;
	}

	@Override
	public Stock getStock(String stock) {
		//  Auto-generated method stub
		switch (stock) {
		case "Astock":
			return new Astock();
		case "Hstock":
			return new Hstock();
		default:
			break;
		}
		//  Auto-generated method stub
		return null;
	}

}
