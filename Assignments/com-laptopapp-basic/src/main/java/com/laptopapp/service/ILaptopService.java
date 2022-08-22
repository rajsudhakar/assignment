package com.laptopapp.service;

import java.util.List;

import com.laptop.exceptions.IdNotFoundException;
import com.laptop.exceptions.LaptopNotFoundException;
import com.laptop.model.Laptop;



public interface ILaptopService {

	void addLaptop(Laptop laptop);
	void updateLaptop(int laptopId, double price);
	void deleteLaptop(int laptopId);

	List<Laptop> getAll();
	List<Laptop> getByType(String type) throws LaptopNotFoundException;
	List<Laptop> getByName(String name) throws LaptopNotFoundException; 
	List<Laptop> getByPrice(double price)throws LaptopNotFoundException;
	
	Laptop getById(int laptopId) throws IdNotFoundException;
	

}
