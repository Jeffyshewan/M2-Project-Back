package com.AirData.M2ProjectBack.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class favoritePlane {

    @Id
    public Integer id;

    public String name;
    public String company;
    public String model;
    public String icao;
}
