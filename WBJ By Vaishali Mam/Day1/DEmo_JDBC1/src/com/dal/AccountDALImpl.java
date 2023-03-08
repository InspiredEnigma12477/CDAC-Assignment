package com.dal;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import com.util.DBUtil;

public class AccountDALImpl implements BankDAL {

	//
	private Connection con;
	private CallableStatement cstmt;
	
	  public AccountDALImpl() throws SQLException {
		  con=DBUtil.getCon();
		  
		cstmt=con.prepareCall("{call transfer_funds(?,?,?,?,?)}"); 
		//out parameter
		
		cstmt.registerOutParameter(4, Types.DOUBLE);//parameter 4 data type is double JVM send this info to DB
		cstmt.registerOutParameter(5, Types.DOUBLE);//parameter 5
		
		
		 System.out.println("---account dal created----"); 
		  
		  
	}
	
	
	@Override
	public String moneyTransfer(int sId, int rId, double amount) throws SQLException {

		cstmt.setInt(1, sId);//1st IN parameter
		cstmt.setInt(2, rId);//2nd IN parameter
		cstmt.setDouble(3, amount);//3rd IN parameter
		//execute Stored Procedure
		
		cstmt.execute();		
		return  "Money Transfer : Sender Balance="+cstmt.getDouble(4)+"   Reciver Balance:"+cstmt.getDouble(5);
	}

}
