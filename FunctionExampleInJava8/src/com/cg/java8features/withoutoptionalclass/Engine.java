package com.cg.java8features.withoutoptionalclass;

public class Engine {

	private VelocityMonitor vMonitor;

	public Engine() {
		super();
	}

	public Engine(VelocityMonitor vMonitor) {
		super();
		this.vMonitor = vMonitor;
	}

	public VelocityMonitor getvMonitor() {
		return vMonitor;
	}

	public void setvMonitor(VelocityMonitor vMonitor) {
		this.vMonitor = vMonitor;
	}

	@Override
	public String toString() {
		return "Engine [vMonitor=" + vMonitor + "]";
	}
	
	
}
