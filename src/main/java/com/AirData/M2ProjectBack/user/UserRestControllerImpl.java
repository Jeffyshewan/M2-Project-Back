package com.AirData.M2ProjectBack.user;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserRestControllerImpl implements UserRestController {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User addNewUser(User user) {
        return userRepository.save(user);
    }
}
