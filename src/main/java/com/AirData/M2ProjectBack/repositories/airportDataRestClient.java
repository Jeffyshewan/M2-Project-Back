package com.AirData.M2ProjectBack.repositories;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class airportDataRestClient {

    private void standardCall(String iata) throws java.io.IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://airport-info.p.rapidapi.com/airport?icao="+ iata))
                .header("x-rapidapi-host", "airport-info.p.rapidapi.com")
                .header("x-rapidapi-key", "c4f23f0c7fmsh782b7e17ed92d8bp1e84c0jsn36a614383de3")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

    public void getAirportDataWithIata(String iata) {
        try {
            standardCall(iata);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getAirportDataWithIcao(String icao) {
        try {
            standardCall(icao);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
