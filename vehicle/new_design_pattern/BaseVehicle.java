package com.test.vehicle.new_design_pattern;

public class BaseVehicle extends AbsVehicle {
	
	private int numOfWheels;
	private int numOfPassengers;
	private boolean hasGas;
	
	public BaseVehicle(int wheels,int passengers,boolean gas) {
		this.numOfWheels=wheels;
		this.numOfPassengers=passengers;
		this.hasGas=gas;
	}

	@Override
	int set_num_of_wheels() {
		// TODO Auto-generated method stub
		return this.numOfWheels;
	}

	@Override
	int set_num_of_passengers() {
		// TODO Auto-generated method stub
		return this.numOfPassengers;
	}

	@Override
	boolean has_gas() {
		// TODO Auto-generated method stub
		return this.hasGas;
	}

}
