package com.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.User;
import com.utils.DBUtils;

public class UserDALImpl implements UserDAL {
	private Connection con;
	private PreparedStatement stmt;
	
	public UserDALImpl() 
	{
		try
		{
		con=DBUtils.getCon();
		
		stmt=con.prepareStatement("select  *  from users where email=? and password=?");
		System.out.println("----inside UserDalImpl-----");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	

	@Override
	public User validateUser(String userName, String pwd) throws SQLException {
		 
		System.out.println("-----inside validateUser method-----"+userName+"   "+pwd);
		//add parameter
		 stmt.setString(1, userName);
		 stmt.setString(2, pwd);
		 
		ResultSet rset= stmt.executeQuery();
		 User user=null;
		while(rset.next())
		{
			user=new User(rset.getInt("userid"),
					      rset.getString("custName"),  
					      rset.getString("city"),
					      rset.getString("email"),
					      rset.getString("password"));
		}		
		return user;
	}

	public void cleanUp() throws SQLException
	{
		System.out.println("---userDal cleanup-----");
		if(stmt!=null)
			stmt.close();
	}
}
