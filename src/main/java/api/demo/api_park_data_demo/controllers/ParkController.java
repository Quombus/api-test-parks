package api.demo.api_park_data_demo.controllers;

import api.demo.api_park_data_demo.data.VarkRepo;
import api.demo.api_park_data_demo.models.Vark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ParkController {

    @Autowired
    private VarkRepo varkRepo;


    @GetMapping("/")
    public String index(Model model) {
        Iterable<Vark> varks = varkRepo.findAll();
        model.addAttribute("varks", varks);
        return "index";
    }

    @GetMapping("parkview")
    public String varkview() {
        return "/parkview";
    }

    @GetMapping("randc")
    public String randc() {
        return "randc";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("signup")
    public String signup() {
        return "signup";
    }

    @GetMapping("edituser")
    public String edituser() {
        return "edituser";
    }

    @GetMapping("parksearch")
    public String parksearch() {
        return "parksearch";
    }



}
