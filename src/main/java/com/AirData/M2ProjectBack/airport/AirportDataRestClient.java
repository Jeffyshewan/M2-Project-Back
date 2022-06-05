package com.AirData.M2ProjectBack.airport;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface AirportDataRestClient {

    @RequestMapping("/airport/iata/{iata}")
    String getAirportDataWithIata(@PathVariable("iata") String iata);

    @RequestMapping("/airport/icao/{icao}")
    String getAirportDataWithIcao(@PathVariable("icao") String icao);
}
