package com.latewind.pattern.commend;

public class RunCommend implements Commend {
	private Receiver receiver;

	public RunCommend(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.executeRunning();
		// Auto-generated method stub

	}

}
