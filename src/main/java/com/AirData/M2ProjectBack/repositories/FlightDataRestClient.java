package com.AirData.M2ProjectBack.repositories;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FlightDataRestClient {

    public String getFlightFromNumber() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://aerodatabox.p.rapidapi.com/flights/AF1294/delays"))
                .header("X-RapidAPI-Host", "aerodatabox.p.rapidapi.com")
                .header("X-RapidAPI-Key", "c4f23f0c7fmsh782b7e17ed92d8bp1e84c0jsn36a614383de3")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }
}
