package com.laptopapp.dao;

import java.util.List;

import com.laptop.exceptions.IdNotFoundException;
import com.laptop.exceptions.LaptopNotFoundException;
import com.laptop.model.Laptop;

public interface  ILaptopRepository {
	void addLaptop(Laptop laptop);
	void updateLaptop(int laptopId, double price);
	void deleteLaptop(int laptopId);

	 List<Laptop> findAll() ;
	
	
	List<Laptop> findByType(String type) throws LaptopNotFoundException;
	List<Laptop> findByName(String name)  throws LaptopNotFoundException; 
	List<Laptop> findByPrice(double price) throws LaptopNotFoundException;
	
	Laptop findById(int laptopId) throws IdNotFoundException;
}
