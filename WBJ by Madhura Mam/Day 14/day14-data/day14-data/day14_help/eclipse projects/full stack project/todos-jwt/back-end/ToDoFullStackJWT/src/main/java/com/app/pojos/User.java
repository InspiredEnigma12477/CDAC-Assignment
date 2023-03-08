package com.app.pojos;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends BaseEntity{
	@Column(length = 30,unique = true)
	private String userName;
	@Column(length = 30, unique = true)
	private String email;
	@Column(length = 300)//larger length required for encrypted passwords
	private String password;
	private boolean active;
	//uni dir many-to-many from User *----->* Role
	@ManyToMany
	@JoinTable(name = "user_roles", 
	joinColumns = @JoinColumn(name = "user_id"), 
	inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	
}
