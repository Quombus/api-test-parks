package api.demo.api_park_data_demo.controllers;

import api.demo.api_park_data_demo.mappers.ObjectMapperDemo;
import api.demo.api_park_data_demo.models.NpsResponse;
import api.demo.api_park_data_demo.models.Park;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

//    https://developer.nps.gov/api/v1/parks?
//    limit=473&start=0&
//    q=linc&api_key=CUzkMTnNk745wAFn8zcHRo8NqXbEFmUglCDLbgmC
    @RequestMapping("")
    public String index() {
        return "search";
    }

    @PostMapping("results")
    public String searchForPark(Model model, @RequestParam String searchTerm ) {
        ObjectMapperDemo objectMapperDemo = new ObjectMapperDemo();
        NpsResponse response;
        List<Park> parksToRender = new ArrayList<>();

        try {
            response = objectMapperDemo.readJsonWithObjectMapper();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Park park : response.getData()) {
            if (park.getFullName().contains(searchTerm)) {
                parksToRender.add(park);
            }
        }

        model.addAttribute("parks", parksToRender);

    return "search";
    }

}
