package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojos.User;
import static utils.DBUtils.getCn;

public class UserDaoImpl implements IUserDao {
	// state
	private Connection cn;
	private PreparedStatement pst1;

	// def ctor : will be invoked by LoginServlet : from init method
	public UserDaoImpl() throws SQLException {
		cn = getCn();
		pst1 = cn.prepareStatement("select * from users where email =? and password=?");
		System.out.println("user dao created....");
	}

	@Override
	public User authenticateUser(String email, String pwd) throws SQLException {
		// set IN params
		pst1.setString(1, email);
		pst1.setString(2, pwd);
		//exec method : exec query
		System.out.println("exec user auth query.....");
		try(ResultSet rst=pst1.executeQuery())
		{
			if(rst.next())
				//userId, String name, String email, String password, double regAmount, Date regDate, String role
				return new User(rst.getInt(1),rst.getString(2),
						email,pwd,rst.getDouble(5),rst.getDate(6),rst.getString(7));
		}
		
		return null;
	}

	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		System.out.println("user dao cleaned up....");
	}

}
