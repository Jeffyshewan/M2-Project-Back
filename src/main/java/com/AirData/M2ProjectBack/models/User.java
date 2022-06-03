package com.AirData.M2ProjectBack.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class User {

    @Id
    public Integer id;

    public String username;
    public String email;
    public String password;
}
