package com.clphub.demo.controller;


import com.clphub.demo.model.User;
import com.clphub.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/Users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(value = "/saveUser")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping(value = "/getUserByID/{userID}")
    public ResponseEntity<?> getUserList(@PathVariable Long userID) {
        return new ResponseEntity<>(userService.getUserByID(userID), HttpStatus.OK);
    }


    @GetMapping(value = "/updateUserFirstName/{userID}/{newname}")
    public ResponseEntity<?> updateUserFirstName(@PathVariable Long userID, @PathVariable String newname) {
        return new ResponseEntity<>(userService.updateUserFirstName(userID, newname), HttpStatus.OK);
    }


    @GetMapping(value = "/findUserByName/{firstName}")
    public ResponseEntity<List<User>> findUserByName(@PathVariable String firstName) {
        return new ResponseEntity<>(userService.findUserByName(firstName), HttpStatus.OK);
    }

    @GetMapping(value = "/getAllUsers")
    public ResponseEntity<?> getAllUsers() {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }


}
