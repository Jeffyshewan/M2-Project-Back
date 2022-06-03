package com.AirData.M2ProjectBack.services;

import com.AirData.M2ProjectBack.models.Airport;

public interface AirportService {

    public String getAirportWithIata(String iata);

    public String getAirportWithIcao(String icao);
}
