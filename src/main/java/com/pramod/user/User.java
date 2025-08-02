package com.pramod.user;

import com.pramod.usergroup.UserGroup;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue
	private int userID;
	private String firstName;
	private String lastName;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@ManyToMany
	public Set<UserGroup> userGroupSet;
	

}
