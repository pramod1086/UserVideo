package com.pramod.usergroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserGroupService {
	UserGroupRepository userGroupRepository;
	@Autowired
  public UserGroupService(UserGroupRepository userGroupRepository) {
	  this.userGroupRepository = userGroupRepository;
	  
  }
  
  public List<UserGroup> getAllUserGroups(){
	  return userGroupRepository.findAll();
  }

}
