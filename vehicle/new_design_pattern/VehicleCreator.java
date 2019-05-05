package com.test.vehicle.new_design_pattern;

public class VehicleCreator {
	
	public Car getCar() {
		 return new Car(4,2,true);
	}
	
	public Plane getPlane() {
		return new Plane(2,50,false);
	}
}
