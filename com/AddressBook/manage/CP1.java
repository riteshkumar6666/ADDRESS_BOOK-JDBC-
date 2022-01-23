package com.AddressBook.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP1 {
	 static Connection con;
		public static Connection  createC()
		{
			try {
				//load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				 
				//create the connection....
				String user="root";
				String password="12345";
				
				String url="jdbc:mysql://localhost:3306/address_book";

					con= DriverManager.getConnection(url,user,password);
					
				} 
			catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			return con; 
		}

}
