package com.pramod.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	UserRepository myUserRepository;
	@Autowired
  public UserService(UserRepository myUserRepository) {
	  this.myUserRepository = myUserRepository;
	  
  }
  
  public List<User> getAllUsers(){
	  return myUserRepository.findAll();
  }
  public User save(User usr){
	   myUserRepository.save(usr);
	   return usr;
  }

public void deleteById(int id) {
	// TODO Auto-generated method stub
	   myUserRepository.deleteById((long) id);

	
}
}
