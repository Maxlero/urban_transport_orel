package by.grsu.orel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller for `/user` page
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(method = RequestMethod.GET)
    public String userIndex() {
        return "user/index";
    }
}
