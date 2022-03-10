package com.cg.java8features.withoutoptionalclass;

public class SpaceShip {
	
	private Engine engine;
	private String pilot;
	
	public SpaceShip() {
		super();
	}
	public SpaceShip(Engine engine, String pilot) {
		super();
		this.engine = engine;
		this.pilot = pilot;
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getPilot() {
		return pilot;
	}
	public void setPilot(String pilot) {
		this.pilot = pilot;
	}
	@Override
	public String toString() {
		return "SpaceShip [engine=" + engine + ", pilot=" + pilot + "]";
	}
	
	

}
