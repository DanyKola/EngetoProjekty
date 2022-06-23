package com.example.demo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ZavolaniAppi {
    private static final String POSTS_API_URL = "https://euvatrates.com/rates.json";

    public String zavolejAppi() throws IOException, InterruptedException {

       
        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(POSTS_API_URL)).GET().build();
      
        HttpResponse<String> httpResponse = httpClient.send(httpRequest,HttpResponse.BodyHandlers.ofString());

      
        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
        return httpResponse.body();
    }
}


