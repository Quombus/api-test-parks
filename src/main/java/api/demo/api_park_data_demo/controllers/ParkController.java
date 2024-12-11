package api.demo.api_park_data_demo.controllers;

import api.demo.api_park_data_demo.models.Park;
import api.demo.api_park_data_demo.services.ParkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ParkController {

    private final ParkService parkService;

    public ParkController(ParkService parkService) {
        this.parkService = parkService;
    }

    @GetMapping("index")
    public String home(Model model) {
        Park park = parkService.getSinglePark();  // Get a single park
        model.addAttribute("park", park);  // Pass the single park to the view
        return "index";  // Thymeleaf template
    }
}
