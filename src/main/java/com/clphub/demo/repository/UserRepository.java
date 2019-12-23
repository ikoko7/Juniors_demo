package com.clphub.demo.repository;

import com.clphub.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> getByFirstName(String firstName);
    List<User> getByAge(int age);


}
