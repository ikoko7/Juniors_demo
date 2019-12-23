package com.clphub.demo.service;

import com.clphub.demo.model.User;
import com.clphub.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUserByID(Long userID) {
        return userRepository.findById(userID).orElse(null);
    }

    public void deleteUser(Long userID) {
        userRepository.deleteById(userID);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public List<User> findUserByName(String firstName) {


       /* List<User> allUsers = getAllUsers();
        List<User> usersToReturn = new ArrayList<>();
        for (User user : allUsers) {
            if (user.getFirstName().equalsIgnoreCase(firstName)) {
                usersToReturn.add(user);
            }
        }
        return usersToReturn;*/

        return getAllUsers().stream().filter(e->e.getFirstName().equalsIgnoreCase(firstName)).collect(Collectors.toList());
    }

    public User updateUserFirstName(Long userID, String newname) {
        User user = getUserByID(userID);
        user.setFirstName(newname);
        return saveUser(user);
    }
}
