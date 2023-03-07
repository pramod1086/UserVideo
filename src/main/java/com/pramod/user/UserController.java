package com.pramod.user;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/getallusers")
    public List<User> getUser() {

        List<User> listOfUser = userService.getAllUsers();
        return listOfUser;

    }


     @PostMapping("/user")
     ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        User saveUser = userService.save(user);
		 return new ResponseEntity<>(saveUser, HttpStatus.ACCEPTED);
    }

    @PutMapping("/user/{id}")
    ResponseEntity<User> updateUer(@PathVariable int id, @Valid @RequestBody User user){

        user.setUserID(id);
        User saveUser = userService.save(user);
        return ResponseEntity.ok().body(saveUser);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteGroup(@PathVariable int id) {
        userService.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
