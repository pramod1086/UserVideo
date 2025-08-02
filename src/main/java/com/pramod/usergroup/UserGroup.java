package com.pramod.usergroup;

import com.pramod.user.User;

import  jakarta.persistence.Entity;
import  jakarta.persistence.GeneratedValue;
import  jakarta.persistence.Id;
import  jakarta.persistence.ManyToMany;
import java.util.Set;

@Entity
public class UserGroup {
	@Id
	@GeneratedValue
	private int userGroupID;
	private String userGroupType;
	public int getUserGroupID() {
		return userGroupID;
	}
	public void setUserGroupID(int userGroupID) {
		this.userGroupID = userGroupID;
	}
	public String getUserGroupType() {
		return userGroupType;
	}
	public void setUserGroupType(String userGroupType) {
		this.userGroupType = userGroupType;
	}
	@ManyToMany
	public Set<User> userSet;
}
