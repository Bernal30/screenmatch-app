package com.empresa.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MainWithSearch {
    //throws lanza explícitamente una excepción para errores con protocolos de internet
    public static void main(String[] args) throws IOException, InterruptedException {

        //creamos una request a un servidor mediante HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                //se coloca el link de la API request
                .uri(URI.create("https://www.omdbapi.com/?apikey=72bc7832&t=Blade+Runner+2049"))
                .build();

        //tenemos que resivir los datos del srevidor
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
