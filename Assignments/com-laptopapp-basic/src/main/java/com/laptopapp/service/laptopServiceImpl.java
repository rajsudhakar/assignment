package com.laptopapp.service;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptop.exceptions.IdNotFoundException;
import com.laptop.exceptions.LaptopNotFoundException;
import com.laptop.model.Laptop;
import com.laptopapp.dao.ILaptopRepository;



@Service
public class laptopServiceImpl implements ILaptopService{

	
	
	@Autowired
	  ILaptopRepository laptopDao;

	@Override
	public void addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLaptop(int laptopId, double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLaptop(int laptopId) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Laptop> getAll() {
		List<Laptop> policies=laptopDao.findAll();
		List<Laptop> policyList=policies
				.stream()
				.sorted((p1,p2)-> p1.getName().compareToIgnoreCase(p2.getName()))
				.collect(Collectors.toList());
		
		return policyList;
	}

	@Override
	public List<Laptop> getByType(String type) throws LaptopNotFoundException {
		List<Laptop> byType = laptopDao.findByType(type);
		if(byType.isEmpty())
			throw new LaptopNotFoundException();
		return byType;
		
	}

	@Override
	public List<Laptop> getByName(String name) throws LaptopNotFoundException {
		List<Laptop> byCategory = laptopDao.findByName(name);
		if(byCategory.isEmpty())
			throw new LaptopNotFoundException();
		return byCategory;
		
	}

	@Override
	public List<Laptop> getByPrice(double price) throws LaptopNotFoundException {
		
		List<Laptop> byPrice = laptopDao.findByPrice(price);
		if(byPrice.isEmpty())
			throw new LaptopNotFoundException();
		return byPrice;
	}

	@Override
	public Laptop getById(int laptopId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Laptop byId = laptopDao.findById(laptopId);
		if(byId==null)
			throw new IdNotFoundException();
		
		return byId;
	}

}