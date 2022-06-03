package com.AirData.M2ProjectBack.repositories;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RequestMapping("/airports")
public class AirportDataRestClient {

    private String standardCall(String data, Boolean iata) throws java.io.IOException, InterruptedException {
        if (iata) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://airport-info.p.rapidapi.com/airport?iata=" + data))
                    .header("x-rapidapi-host", "airport-info.p.rapidapi.com")
                    .header("x-rapidapi-key", "c4f23f0c7fmsh782b7e17ed92d8bp1e84c0jsn36a614383de3")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } else {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://airport-info.p.rapidapi.com/airport?icao=" + data))
                    .header("x-rapidapi-host", "airport-info.p.rapidapi.com")
                    .header("x-rapidapi-key", "c4f23f0c7fmsh782b7e17ed92d8bp1e84c0jsn36a614383de3")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        }
    }

    @RequestMapping("/iata/{iata}")
    public String getAirportDataWithIata(String iata) {
        String data = "";
        try {
            data = standardCall(iata, true);
        } catch (Exception e) {
            System.out.println(e);
        }
        return data;
    }

    @RequestMapping("/icao/{icao}")
    public String getAirportDataWithIcao(@PathVariable("icao") String icao) {
        String data = "";
        try {
            data = standardCall(icao, false);
        } catch (Exception e) {
            System.out.println(e);
        }
        return data;
    }
}
