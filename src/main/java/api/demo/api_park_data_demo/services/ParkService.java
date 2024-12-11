package api.demo.api_park_data_demo.services;

import api.demo.api_park_data_demo.models.NpsResponse;
import api.demo.api_park_data_demo.models.Park;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkService {

    private final RestTemplate restTemplate;

    public ParkService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Park getSinglePark() {
        String apiUrl = "https://developer.nps.gov/api/v1/parks?parkCode=acad&api_key=CUzkMTnNk745wAFn8zcHRo8NqXbEFmUglCDLbgmC";
        NpsResponse response = restTemplate.getForObject(apiUrl, NpsResponse.class);


        if (response != null && response.getResults() != null && !response.getResults().isEmpty()) {
            System.out.println("API Response: " + response);
            return response.getResults().get(0);  // Return the first park from the list
        } else if (response == null) {
            System.out.println("API Response: " + response);
            return null;
        }
        return null;  // Return null if no park is found
    }
}
