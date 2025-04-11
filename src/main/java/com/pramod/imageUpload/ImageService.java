package com.pramod.imageUpload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class ImageService {

    @Autowired
    ImageRepository imageRepository;

    public String uplaodImage(MultipartFile file)
            throws IOException {

        imageRepository.save(Image.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .image(ImageUtility.compressImage(file.getBytes())).build());
        String response = "Image uploaded successfully: " +
                file.getOriginalFilename();
       return response;
    }

    public Image getImageDetails(String name) throws IOException {

        final Optional<Image> dbImage = imageRepository.findByName(name);
        return ImageUtility.decompressImage(dbImage.get().getImage()).build();


    }
    public  byte[] getImage(String name) throws IOException {

        final Optional<Image> dbImage = imageRepository.findByName(name);

        return ImageUtility.decompressImage(dbImage.get().getImage());

    }
}
