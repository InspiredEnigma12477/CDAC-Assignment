package com.tester;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.util.DbUtil;

public class TestSql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// get Connection
		// Step1:connection db
		try (Connection con = DbUtil.getConnectedToDb()) {

			// Step 2:Write Query

			// get all books from Table books
			String sql = "select * from books";

			// step3:associate query with connection

			Statement stmt = con.createStatement();

			// Step4:fire the query
			ResultSet rset = stmt.executeQuery(sql);
			//Step5:get the result
			while (rset.next()) {
//				System.out.println(rset.getInt(1)+" "+
//			rset.getString("title")+" "+
//						rset.getString("author")+" "+
//			rset.getDouble("price"));
				
				//Step6:process
				System.out.printf("%d %s  %s  %.1f", rset.getInt(1),rset.getString(2),rset.getString(3),rset.getDouble(4));
				System.out.println();
			}
			rset.close();
			//step 7:close
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
