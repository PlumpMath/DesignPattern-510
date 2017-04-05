package com.latewind.pattern.adapter;

public class Translater implements Player {

	private ForeignPlayer player;
	public Translater(ForeignPlayer player) {

		this.player=player;
	}

	@Override
	public void attrack() {
		
		player.进攻();
		// Auto-generated method stub

	}

	@Override
	public void defence() {
		// Auto-generated method stub
		player.防守();
	}

}
