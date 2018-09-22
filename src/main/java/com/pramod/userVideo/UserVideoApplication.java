package com.pramod.userVideo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan
@ComponentScan(basePackages= {"com.pramod.user","com.pramod.userGroup","com.pramod.video","com.pramod.videogroup"})
@EntityScan({"com.pramod.user","com.pramod.userGroup","com.pramod.video","com.pramod.videogroup"})
@EnableJpaRepositories({"com.pramod.user","com.pramod.userGroup","com.pramod.video","com.pramod.videogroup"})
public class UserVideoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserVideoApplication.class, args);
	}
}
