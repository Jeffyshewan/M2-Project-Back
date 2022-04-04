package com.AirData.M2ProjectBack.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class favoriteAirport {

    @Id
    public Integer id;

    public String name;
    public String iata;
    public String icao;
    public String country;
    public String country_iso;
}
