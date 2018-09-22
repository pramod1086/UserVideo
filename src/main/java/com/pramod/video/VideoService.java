package com.pramod.video;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class VideoService {
	
	public VideoRepository videoRepository;
	 @Autowired

	public VideoService(VideoRepository videoRepository) {
		this.videoRepository = videoRepository;
	}

	public List<Video> getAllVideo(){
		return videoRepository.findAll();
	}
}
