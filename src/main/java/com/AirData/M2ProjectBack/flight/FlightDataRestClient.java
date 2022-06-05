package com.AirData.M2ProjectBack.flight;

import java.io.IOException;

public interface FlightDataRestClient {

    String getFlightFromNumber() throws IOException, InterruptedException;
}
