package dao;

import java.util.Set;

import pojos.Role;
import pojos.UserRole;

public interface IRoleDao {
	String addRole(Role role);
	//add a method to find role by it's name(enum)
	Role findByRoleName(UserRole roleName);
	
	
}
