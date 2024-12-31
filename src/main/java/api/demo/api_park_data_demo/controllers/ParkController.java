package api.demo.api_park_data_demo.controllers;

import api.demo.api_park_data_demo.data.ParkRepository;
import api.demo.api_park_data_demo.models.Park;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("parks")
public class ParkController {

    @Autowired
    ParkRepository parkRepository;

    @GetMapping("/view/{parkCode}")
    public String displayViewPark(Model model, @PathVariable String parkCode) {
        Optional<Park> optionalPark = parkRepository.findById(parkCode);
        if (optionalPark.isPresent()) {
            Park park = optionalPark.get();
            model.addAttribute("park", park);
        }
        return "parks/view";
    }
}
