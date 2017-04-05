package com.latewind.pattern.builder;

public class LaptopBuilder extends ComputerBuilder {

	public LaptopBuilder() {

		super();
	}

	@Override
	public void buildScreen() {
		// Auto-generated method stub
		computer.setScreen("SAMSUNG");
		
	}

	@Override
	public void buildMotherBoard() {
		
		computer.setMothorBoard("SHENZHOU");
		// Auto-generated method stub

	}

	@Override
	public void buildKeyBoard() {
		// Auto-generated method stub
		computer.setKeyBoard("A4TECH");

	}

	@Override
	public void buildCpu() {
		computer.setCpu("i5-4210M");
		// Auto-generated method stub

	}

}
