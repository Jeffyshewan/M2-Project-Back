package com.AirData.M2ProjectBack.role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
public class Role {

    @Id
    Integer id;

    String role;
}
