package com.AirData.M2ProjectBack.user;

import com.AirData.M2ProjectBack.role.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class User {

    @Id
    public Integer id;

    public String username;
    public String email;
    public String password;
    public List<String> roles;
}
