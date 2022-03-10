package com.cg.java8features.withoutoptionalclass;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) throws Exception{

		SpaceShip falcon = new SpaceShip();
		Optional<SpaceShip> optionalFlacon = Optional.of(falcon);
		System.out.println(optionalFlacon);
		
		//SpaceShip falcon1= null;
		SpaceShip falcon1=new SpaceShip(new Engine(new VelocityMonitor(500)));
		Optional<SpaceShip> optionalFlacon1 = Optional.ofNullable(falcon1);
		System.out.println(optionalFlacon1);
		
		
		if(optionalFlacon1.isPresent()) {
			System.out.println(optionalFlacon1.get());
		}else {
			System.out.println("Object is null");
		}
		
		SpaceShip Flacon11 = null;
		Optional<SpaceShip> optionalFlacon11 = Optional.ofNullable(Flacon11);
		SpaceShip result= optionalFlacon11.orElseThrow(() -> new SpaceShipIsNullException("empty Object"));
		System.out.println(result);
	}

}
