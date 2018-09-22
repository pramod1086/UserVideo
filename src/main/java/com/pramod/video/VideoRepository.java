package com.pramod.video;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pramod.video.Video;;

@Repository

public interface VideoRepository extends JpaRepository<Video, Long> {
	List<Video> findAll();

}
