package com.pramod.usergroup;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface UserGroupRepository extends JpaRepository<UserGroup, Long>{
	List<UserGroup> findAll();


}
