package com.pramod.videogroup;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface VideoGroupRepository extends JpaRepository<VideoGroup, Long>{
	List<VideoGroup> findAll();

}
