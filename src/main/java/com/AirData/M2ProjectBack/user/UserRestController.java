package com.AirData.M2ProjectBack.user;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/users")
public interface UserRestController {

    @GetMapping(value = "/{id}", produces = "application/json")
    Optional<User> findById(@PathVariable("id") Integer id);

    @GetMapping(value = "/{username}", produces = "application/json")
    User findByUsername(@PathVariable("username") String username);

    @PostMapping(value = ("/add/user"), produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    User addNewUser(@RequestBody User user);
}
