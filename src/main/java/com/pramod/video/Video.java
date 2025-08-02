package com.pramod.video;

import  jakarta.persistence.Entity;
import  jakarta.persistence.GeneratedValue;
import  jakarta.persistence.Id;

@Entity
public class Video {
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
