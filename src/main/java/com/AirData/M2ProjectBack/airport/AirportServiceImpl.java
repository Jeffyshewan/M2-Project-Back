package com.AirData.M2ProjectBack.airport;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@NoArgsConstructor
public class AirportServiceImpl implements AirportService {

    private AirportDataRestClientImpl airportDataRestClient;

    @Override
    public String getAirportWithIata(String iata) {
        return airportDataRestClient.getAirportDataWithIata(iata);
    }

    @Override
    public String getAirportWithIcao(String icao) {
        return airportDataRestClient.getAirportDataWithIcao(icao);
    }
}
