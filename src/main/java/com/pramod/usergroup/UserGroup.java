package com.pramod.usergroup;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

}
