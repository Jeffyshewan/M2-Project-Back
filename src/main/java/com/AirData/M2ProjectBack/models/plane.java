package com.AirData.M2ProjectBack.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class plane {

    @Id
    public Integer id;

    public String company;
    public String model;
    public String name;
    public String icao;
    public String registration;
    public String latitute;
    public String longitude;
}
