package dao;

import java.util.List;
import java.util.Set;

import pojos.Passport;
import pojos.Role;
import pojos.User;
import pojos.UserRole;

public interface IUserDao {
//register user
	String registerUser(User user);

	// register user along with roles
	String registerUserWithRoles(User user, Set<UserRole> roles);

	// get users by city
	List<User> getUsersByCity(String city);

	// assign roles to the existing user
	String assignRoles(long userId, Set<UserRole> roles);

	// assign passport details to existing user
	String addPassportDetails(long userId, Passport passport);
}
