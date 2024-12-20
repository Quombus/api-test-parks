package api.demo.api_park_data_demo.mappers;

import api.demo.api_park_data_demo.models.NpsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class ObjectMapperDemo {


    public NpsResponse readJsonWithObjectMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        URL url = new URL("https://developer.nps.gov/api/v1/parks?limit=473&start=0&api_key=CUzkMTnNk745wAFn8zcHRo8NqXbEFmUglCDLbgmC");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        NpsResponse response = objectMapper.readValue(connection.getInputStream(), NpsResponse.class);
        connection.disconnect();

        return response;

    }
}
