package com.empresa.screenmatch.principal;

import com.empresa.screenmatch.modelos.Title;
import com.empresa.screenmatch.modelos.TitleOmdb;
//importaciones de la biblioteca Gson
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    //throws lanza explícitamente una excepción para errores con protocolos de internet
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner reading = new Scanner(System.in);

        System.out.print("Escriba el nombre de una pelicula: ");
        //si se usa reading.nextLine() ocurre un error del tipo IllegalArgumentException al procesar esapcios en la variable dinamicRequest
        String userRequest = reading.next();

        //petición dinamica para API
        String dinamicRequest = "https://www.omdbapi.com/?t="+userRequest+"&apikey=72bc7832";

        //intentamos ejcutar un bloque de código que pueda crear una excepción
        try {
            //creamos una request a un servidor mediante HTTP
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    //se coloca el link de la API request
                    .uri(URI.create(dinamicRequest))
                    .build();

            //tenemos que resivir los datos del servidor
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            //obtenemos la repsuesta de la API en formato JSON
            String json = response.body();
            System.out.println("Formato Json: " + json);

            //instancia de la libreria Gson
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            //clase que recibe atributos en JSON
            TitleOmdb titleRequestOmdb = gson.fromJson(json, TitleOmdb.class);
            System.out.println("Resultado de transformar de Json a una Clase Record: " + titleRequestOmdb);

            //clase que adapta los atributos en JSON a los atributos de la clase Tiltle
            Title titleRequest = new Title(titleRequestOmdb);
            System.out.println("Titulo convertido de JSON a una clase: " + titleRequest);

        } catch (NumberFormatException e) {
            //capturamos un error del try y se muestra el mensaje del error
            System.out.println("Ocurrio un error: ");
            System.out.println(e.getMessage());
        } catch(IllegalArgumentException e) {
            System.out.println("Error en la URI, verifique la dirección.");
        } finally {
            //aun que exista un excepción o no simpre se ejecutara el código de un finally
            System.out.println("Finalizo la ejecución del programa!");
        }



        reading.close();
    }
}
