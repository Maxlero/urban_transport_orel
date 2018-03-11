package by.grsu.orel.Controller;

import by.grsu.orel.Model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/greeting2")
    public String greetingForm(Model model) {
        model.addAttribute("greeting222", new Greeting());
        return "greeting2";
    }

    @PostMapping("/greeting2")
    public String greetingSubmit(@ModelAttribute Greeting greeting333, Model model) {
        model.addAttribute("greeting555", greeting333);
        return "result";
    }

    @GetMapping("/map")
    public String map() {
        return "map";
    }


}
