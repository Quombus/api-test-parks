package api.demo.api_park_data_demo.controllers;

import api.demo.api_park_data_demo.models.Park;
import api.demo.api_park_data_demo.services.NationalParksService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ParkController {

    private final NationalParksService nationalParksService;

    public ParkController(NationalParksService nationalParksService) {
        this.nationalParksService = nationalParksService;
    }

    @GetMapping("/")
    public String getParks(Model model) {
        List<Park> parks = nationalParksService.fetchParks();
        model.addAttribute("parks", parks);
        return "index"; // Thymeleaf template name
    }
}
