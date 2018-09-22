package com.pramod.video;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {
	@Autowired
	public VideoService videoService;
	
	@GetMapping("/user/getallVideo")
 public List<Video> getUser(){
		
		List<Video> listOfVideo = videoService.getAllVideo();
	return listOfVideo;
	
}

}
