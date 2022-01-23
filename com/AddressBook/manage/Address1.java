package com.AddressBook.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;



public class Address1 {
	public static boolean insertAddressToDB(Address ad) 
	{
	boolean f=false;
	
		try {
			
		
		// jdbc code
		Connection con=CP1.createC();
		String q="insert into addressbook(name,phone,city,gender) values(?,?,?,?)";
		//preparedStatement
		PreparedStatement  pstmt   =con.prepareStatement(q);
		//set the value of parameter
		pstmt.setString(1,ad.getName());
		pstmt.setString(2,ad.getPhone());
		pstmt.setString(3,ad.getCity());
		pstmt.setString(4,ad.getgender());
		
		
		
		//execute..
		pstmt.executeUpdate();
		f=true;
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;

	}

}
