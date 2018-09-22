package com.pramod.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	//User findbyID(int User.);
	List<User> findAll();
    User save(User persisted);
    void delete(User entity);               



}
