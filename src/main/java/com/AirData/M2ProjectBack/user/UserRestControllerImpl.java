package com.AirData.M2ProjectBack.user;

import org.springframework.beans.factory.annotation.Autowired;

public class UserRestControllerImpl implements UserRestController {

    @Autowired
    UserService userService;

    @Override
    public User findById(Integer id) throws Exception {
        return userService.findById(id);
    }

    @Override
    public User findByUsername(String username) throws Exception {
        return userService.findByUsername(username);
    }

    @Override
    public void addNewUser(User user) {
        userService.addNewUser(user);
    }
}
