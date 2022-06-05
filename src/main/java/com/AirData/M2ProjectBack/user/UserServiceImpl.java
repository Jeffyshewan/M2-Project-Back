package com.AirData.M2ProjectBack.user;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User findById(Integer id) throws Exception {
        Optional<User> user = userRepository.findById(id);

        if(user.isEmpty()) {
            throw new Exception("not found");
        }

        return user.get();
    }

    @Override
    public User findByUsername(String username) throws Exception {
        Optional<User> user = userRepository.findByUsername(username);

        if(user.isEmpty()) {
            throw new Exception("not found");
        }

        return user.get();
    }

    @Override
    public void addNewUser(User user) {
        userRepository.save(user);
    }
}
