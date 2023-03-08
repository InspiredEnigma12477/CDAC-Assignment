package com.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.dal.AccountDALImpl;
import com.util.DBUtil;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			DBUtil.openConnection();

			AccountDALImpl actDal = new AccountDALImpl();
			System.out.println("Enter SenderID Reciver ActID Amount");
			Scanner sc = new Scanner(System.in);

			String status = actDal.moneyTransfer(sc.nextInt(), sc.nextInt(), sc.nextDouble());
			System.out.println(status);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
