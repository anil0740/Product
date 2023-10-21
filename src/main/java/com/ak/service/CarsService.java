package com.ak.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ak.dao.CarsDao;
import com.ak.entity.Cars;
@Service
public class CarsService implements CarsDao {
	List<Cars> carslist=new ArrayList<>();
	@Override
	public String addCar(Cars car) {
		// TODO Auto-generated method stub
		carslist.add(car);
		return "cars added to list";
	}

	@Override
	public List<Cars> getAllCars() {
		// TODO Auto-generated method stub
		return carslist;
	}

}
