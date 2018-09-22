package com.pramod.videogroup;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoGroupController {
	
	public VideoGroupService videoGroupService;
	
	@GetMapping("/user/getallVideoGroups")
 public List<VideoGroup> getVideoGroups(){
		
		List<VideoGroup> listOfVideoGroup = videoGroupService.getAllVideoGroup();
	return listOfVideoGroup;
	
}

}
