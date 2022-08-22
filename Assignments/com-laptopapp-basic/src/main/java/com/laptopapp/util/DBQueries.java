package com.laptopapp.util;

public class DBQueries {

	public static final  String INSERTQUERY=
			"INSERT INTO LAPTOP(laptop_name,type,laptop_Id,price) values(?,?,?,?)";
	
	public static final  String UPDATEQUERY="UPDATE LAPTOP SET laptop_id=? where price=?";
	public static final  String DElETEQUERY="DELETE FROM LAPTOP WHERE laptop_id=?";
	
	public static final String SELECTQUERY = "SELECT * FROM LAPTOP";
	public static final String SELECTBYTYPE = "SELECT * FROM LAPTOP WHERE TYPE=?";
	public static final String SELECTBYPRICE = "SELECT * FROM LAPTOP WHERE PRICE=?";
	
	public static final String SELECTBYID = "SELECT * FROM LAPTOP WHERE laptop_id=?";
}
