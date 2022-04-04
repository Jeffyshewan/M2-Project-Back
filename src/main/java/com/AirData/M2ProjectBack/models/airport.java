package com.AirData.M2ProjectBack.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class airport {

    @Id
    public Integer id;

    public String iata;
    public String icao;
    public String name;
    public String location;
    public String street_number;
    public String street;
    public String city;
    public String county;
    public String state;
    public String country_iso;
    public String country;
    public String postal_code;
    public String phone;
    public Float latitude;
    public Float longitude;
    public Integer uct;
    public String website;
}
