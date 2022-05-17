package com.example.demo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ZavolaniAppi {
    private static final String POSTS_API_URL = "https://euvatrates.com/rates.json";

    public String zavolejAppi() throws IOException, InterruptedException {

        //HttpClient  = Vytvoření HTTP klienta
        HttpClient httpClient = HttpClient.newBuilder().build();

        //HttpRequest = Vytvoření HTTP požadavku - specifikuji adresu a metodu volání GET
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(POSTS_API_URL)).GET().build();

        //HttpResponse = zavolání
        HttpResponse<String> httpResponse = httpClient.send(httpRequest,HttpResponse.BodyHandlers.ofString());

        //Vypíšeme status 200
        //Vypíše obsah
        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
        return httpResponse.body();
    }
}


