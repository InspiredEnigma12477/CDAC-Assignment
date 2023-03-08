package dao;

import java.sql.SQLException;

import pojos.User;

public interface IUserDao {
	User authenticateUser(String email,String pwd) throws SQLException;
}
