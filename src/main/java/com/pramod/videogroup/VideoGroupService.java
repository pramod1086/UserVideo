package com.pramod.videogroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class VideoGroupService {
	
 public VideoGroupRepository videoGroupRepository;
 
 @Autowired
    public VideoGroupService(VideoGroupRepository videoGroupRepository) {
    	this.videoGroupRepository = videoGroupRepository;
    	
    }
    
    public List<VideoGroup> getAllVideoGroup(){
    	return videoGroupRepository.findAll();
    	
    }

}
