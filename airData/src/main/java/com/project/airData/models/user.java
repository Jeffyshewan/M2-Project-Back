package com.project.airData.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class user {

    @Id
    public Integer id;

    public String username;
    public String email;
    public String password;
}
