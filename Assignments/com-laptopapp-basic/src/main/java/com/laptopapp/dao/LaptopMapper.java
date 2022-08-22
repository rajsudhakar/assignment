package com.laptopapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import com.laptop.model.Laptop;

public class LaptopMapper implements RowMapper<Laptop>{

	

	@Override
	public Laptop mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		String laptopName = rs.getString("laptop_name");
		String laptopType = rs.getString("type");
		double price = rs.getDouble("price");
		int laptopId = rs.getInt("laptop_id");
		
		// set the domain object
		Laptop laptop = new Laptop();
		laptop.setName(laptopName);
		laptop.setPrice(price);
		laptop.setType(laptopType);
		laptop.setLaptopId(laptopId);
		return laptop;
		
	}

	
}
