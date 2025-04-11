package com.pramod.imageUpload;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Image {

    @Id
    @GeneratedValue
    private int imageID;

    private String imageName;

    private String type;
    private byte[] picByte;

}
