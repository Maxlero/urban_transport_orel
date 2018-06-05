package by.grsu.orel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for `/manage` page
 */
@Controller
@RequestMapping("/manage")
public class ManageController {
    @RequestMapping(method = RequestMethod.GET)
    public String start(Model model) {
        return "manage";
    }
}
