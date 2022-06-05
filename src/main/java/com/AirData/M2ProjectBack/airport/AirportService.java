package com.AirData.M2ProjectBack.airport;

public interface AirportService {

    public String getAirportWithIata(String iata);

    public String getAirportWithIcao(String icao);
}
