package com.dal;

import java.sql.SQLException;

public interface BankDAL {
//CRUD for Accounts
	//Do in Lab
	//insert update delete
	String moneyTransfer(int sId,int rId,double amount) throws SQLException ;
}
