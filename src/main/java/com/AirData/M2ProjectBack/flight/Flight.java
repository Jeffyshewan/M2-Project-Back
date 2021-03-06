package com.AirData.M2ProjectBack.flight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class Flight {
    @Id
    public Integer id;

    public String flightNumber;
    public String date;
    public String departureHour;
    public String departureAirport;
    public String departureUtc;
    public String arrivalHour;
    public String arrivalAirport;
    public String arrivalUtc;


}
