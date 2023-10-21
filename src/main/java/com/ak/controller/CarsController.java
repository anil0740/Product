package com.ak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ak.entity.Cars;
import com.ak.service.CarsService;

@RestController
@RequestMapping("/carsapi")
public class CarsController {
	
	
	@Autowired
	private CarsService cs;
	@PostMapping("/add")
	public String addCar(@RequestBody Cars c) {
		return cs.addCar(c);
	}
	@GetMapping("/get")
	public List<Cars> getAllCars(){
		return cs.getAllCars();
	}
	}
	

