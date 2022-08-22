package com.laptopapp.client;



import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.laptop.exceptions.IdNotFoundException;
import com.laptopapp.service.ILaptopService;
import com.laptopapp.service.laptopServiceImpl;




public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext("com.laptop");
		Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
		ILaptopService laptopService = context.getBean(laptopServiceImpl.class,"laptopServiceImpl");
		laptopService.getAll().forEach(System.out::println);
		
		System.out.println("By type");
		laptopService.getByType("macbook").forEach(System.out::println);
		System.out.println("By name");
		laptopService.getByName("asus").forEach(System.out::println);
		
		System.out.println("By id");
		try {
			System.out.println("By id  "+laptopService.getById(9));
		} catch (IdNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("By price");
		laptopService.getByPrice(2778.0).forEach(System.out::println);
	}

}
