package com.pramod.imageUpload;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Builder
@Getter
@Setter
public class Image {

    @Id
    @GeneratedValue
    private int imageID;

    private String imageName;

    private String type;
    private byte[] image;

}
