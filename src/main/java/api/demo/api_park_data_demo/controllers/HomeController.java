package api.demo.api_park_data_demo.controllers;

import api.demo.api_park_data_demo.data.ParkRepository;
import api.demo.api_park_data_demo.mappers.ObjectMapperDemo;
import api.demo.api_park_data_demo.models.NpsResponse;
import api.demo.api_park_data_demo.models.Park;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    private ParkRepository parkRepository;

    @GetMapping("/")
    public String index(Model model) {
        ObjectMapperDemo objectMapperDemo = new ObjectMapperDemo();
        NpsResponse response;
        try {
             response = objectMapperDemo.readJsonWithObjectMapper();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        parkRepository.saveAll(response.getData());

        model.addAttribute("npsResponse", response);
        return "index";
    }


}
