package by.grsu.orel.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/result")
    public String result() {
        return "result";
    }

//    @GetMapping("/greeting")
//    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, model model) {
//        model.addAttribute("name", name);
//        return "greeting";
//    }
//
//    @GetMapping("/greeting2")
//    public String greetingForm(model model) {
//        model.addAttribute("greeting222", new Greeting());
//        return "greeting2";
//    }
//
//    @PostMapping("/greeting2")
//    public String greetingSubmit(@ModelAttribute Greeting greeting333, model model) {
//        model.addAttribute("greeting555", greeting333);
//        return "result";
//    }
//
//    @GetMapping("/map")
//    public String map(model model) {
//
//        double x = 23.85;
//        model.addAttribute("x", x);
//
//        return "index";
//    }
//
//    @GetMapping("/addRoute")
//    public String addRoute() {
//        return "addRoute";
//    }


}
