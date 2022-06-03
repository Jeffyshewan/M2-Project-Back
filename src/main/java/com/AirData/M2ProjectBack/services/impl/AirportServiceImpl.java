package com.AirData.M2ProjectBack.services.impl;

import com.AirData.M2ProjectBack.models.Airport;
import com.AirData.M2ProjectBack.repositories.AirportDataRestClient;
import com.AirData.M2ProjectBack.services.AirportService;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@NoArgsConstructor
public class AirportServiceImpl implements AirportService {

    private AirportDataRestClient airportDataRestClient;

    @Override
    public String getAirportWithIata(String iata) {
        return airportDataRestClient.getAirportDataWithIata(iata);
    }

    @Override
    public String getAirportWithIcao(String icao) {
        return airportDataRestClient.getAirportDataWithIcao(icao);
    }
}
