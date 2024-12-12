package api.demo.api_park_data_demo.services;

import api.demo.api_park_data_demo.models.NpsResponse;
import api.demo.api_park_data_demo.models.Park;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
public class NationalParksService {

    private String apiUrl = "https://developer.nps.gov/api/v1/parks?limit=1&start=0&api_key=CUzkMTnNk745wAFn8zcHRo8NqXbEFmUglCDLbgmC";

    private final RestTemplate restTemplate;

    public NationalParksService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Park> fetchParks() {
        String url = UriComponentsBuilder.fromHttpUrl(apiUrl)
                .toUriString();

        NpsResponse parksResponse = restTemplate.getForObject(url, NpsResponse.class);
        return parksResponse != null ? parksResponse.getData() : null;
    }
}