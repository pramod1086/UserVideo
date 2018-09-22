package com.pramod.usergroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserGroupController {
	
@Autowired
public UserGroupService userGroupService;

	
	@GetMapping("/user/getalluserGroups")
 public List<UserGroup> getUser(){
		
		List<UserGroup> listOfUserGroup = userGroupService.getAllUserGroups();
	return listOfUserGroup;
	
}

}
