/**
 * 
 */
package com.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.exception.DataAccessException;

public class BaseDAO {
    private static String driver=null;
    private static String url=null;
    private static String username=null;
    private static String password=null;
    static{
	ResourceBundle resource = ResourceBundle.getBundle("com.mindtree.dao.Database");
	driver=resource.getString("driver");
	url=resource.getString("url");
	username=resource.getString("username");
	password=resource.getString("password");
	
	    try {
		Class.forName(driver);
	    } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		
	    e.printStackTrace();
	
	    System.out.println("Unable to load the Driver");
	}
    }//End of static block
    public Connection getConnection()throws DataAccessException{
	try{
	    return DriverManager.getConnection(url,username,password);
	}catch(SQLException e){
	    throw new DataAccessException("Unable to connect...");
	}

    }//end of getConnection method
    public void releaseResources(Connection con,Statement st) throws DataAccessException{
	if(con!=null){
	    try{
		con.close();
	    }catch(SQLException exception){
			throw new DataAccessException("Connection cannot be released...");

	    }
	}
	if(st!=null){
	    try{
		st.close();
	    }catch(SQLException excption){
		throw new DataAccessException("Statement cannot be released...");
	    }
	}
    }//end of release method


}//end of BaseDao class
