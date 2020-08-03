package com.test.vehicle;
//Car class using given interface
public class Car implements Vehicle{

	@Override
	public int set_num_of_wheels() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int set_num_of_passengers() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public boolean has_gas() {
		// TODO Auto-generated method stub
		return false;
	}

}
