package com.tester;
import  static com.util.DBUtil.openConnection;
public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			openConnection();
			//CRUD:
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}
