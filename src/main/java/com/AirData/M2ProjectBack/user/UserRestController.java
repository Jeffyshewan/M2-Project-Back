package com.AirData.M2ProjectBack.user;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/users")
public interface UserRestController {

    @GetMapping(value = "/{id}", produces = "application/json")
    User findById(@PathVariable("id") Integer id) throws Exception;

    @GetMapping(value = "/{username}", produces = "application/json")
    User findByUsername(@PathVariable("username") String username) throws Exception;

    @PostMapping(value = ("/add/user"), produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    void addNewUser(@RequestBody User user);
}
