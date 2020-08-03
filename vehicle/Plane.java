package com.test.vehicle;
//plane class using given interface
public class Plane implements Vehicle{

	@Override
	public int set_num_of_wheels() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int set_num_of_passengers() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public boolean has_gas() {
		// TODO Auto-generated method stub
		return true;
	}

}
