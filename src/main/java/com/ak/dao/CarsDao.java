package com.ak.dao;

import java.util.List;

import com.ak.entity.Cars;

public interface CarsDao {
	public String addCar(Cars car);
	public List<Cars> getAllCars();
	

}
