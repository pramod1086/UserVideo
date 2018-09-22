package com.pramod.videogroup;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VideoGroup {
	@Id
	@GeneratedValue
	private int VideoID;
	private String VideoName;
	public int getVideoID() {
		return VideoID;
	}
	public void setVideoID(int videoID) {
		VideoID = videoID;
	}
	public String getVideoName() {
		return VideoName;
	}
	public void setVideoName(String videoName) {
		VideoName = videoName;
	}
}
