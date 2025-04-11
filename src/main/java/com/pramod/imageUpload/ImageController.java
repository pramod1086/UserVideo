package com.pramod.imageUpload;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class ImageController {

    ImageService imageService;

    @PostMapping("/upload/image")
    public String uplaodImage(@RequestParam("image") MultipartFile file)
            throws IOException {

        return imageService.uplaodImage(file);
    }

    @GetMapping(path = {"/get/image/info/{name}"})
    public Image getImageDetails(@PathVariable("name") String name) throws IOException {

        return imageService.getImageDetails(name);

    }

    @GetMapping(path = {"/get/image/{name}"})
    public byte[] getImage(@PathVariable("name") String name) throws IOException {
        return imageService.getImage(name);


    }

}
