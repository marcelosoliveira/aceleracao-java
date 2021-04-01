package com.challenge.controller;

import com.challenge.entity.user.User;
import com.challenge.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
public class UserController {

    @Autowired
    private RepositoryUser repositoryUser;


    @GetMapping(path = "/user")
    public Iterable<User> list() {
        return repositoryUser.findAll();
    }

    @GetMapping(path = "/user/{id}")
    public User userListUnique(@PathVariable(value = "id") long id) {
        return repositoryUser.findById(id);
    }

    @PostMapping(path = "/user")
    public User saveUser(@RequestBody User user) {
        return repositoryUser.save(user);
    }

    @PutMapping(path = "/user")
    public User upadateUser(@RequestBody User user) {
        return repositoryUser.save(user);
    }

    @DeleteMapping(path = "/user/{id}")
    public void deleteUser(@PathVariable(value = "id") long id) {
        repositoryUser.deleteById(id);
    }

}
