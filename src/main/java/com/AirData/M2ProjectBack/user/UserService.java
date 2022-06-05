package com.AirData.M2ProjectBack.user;

public interface UserService {

    User findById(Integer id) throws Exception;
    User findByUsername(String username) throws Exception;
    void addNewUser(User user);
}
