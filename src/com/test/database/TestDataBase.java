package com.test.database;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class TestDataBase {
	
	private static Connection CONNECTION = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static void main(String[] args) {
		try{
			String DATABASE_URL = "jdbc:mysql://localhost:3306/world";
			String USER = "root";
			String PASSWORD = "laotao2004";
			Class.forName("com.mysql.jdbc.Driver");
			CONNECTION = DriverManager.getConnection(DATABASE_URL,USER,PASSWORD);
			stmt = CONNECTION.createStatement();
			rs = stmt.executeQuery("select * from city");
			while(rs.next()){
				int intID = rs.getInt("ID");
				String strName = rs.getString("Name");
				String strCountryCode = rs.getString("CountryCode");
				String strDistrict = rs.getString("CountryCode");
				int intPopulation = rs.getInt("Population");
				System.out.println(intID+","+strName+","+strCountryCode+","+strDistrict+","+intPopulation);
			}
		}
		
		catch(Exception e){
			System.out.println("木有连上");
		}
		
		try {
			
			if(rs != null){
				rs.close();
				rs = null;
			}		
			if(stmt != null){
				stmt.close();
				stmt = null;
			}		
			if(CONNECTION != null){
				CONNECTION.close();
				CONNECTION = null;
			}
		}
		catch(Exception e){
			System.out.println("关闭失败");
		}
		

	}

}
