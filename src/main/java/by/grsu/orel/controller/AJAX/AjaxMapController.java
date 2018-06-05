package by.grsu.orel.controller.AJAX;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for `/ajaxMap` page
 */
@Controller
@RequestMapping("/ajaxMap")
public class AjaxMapController {
    @GetMapping
    public String ajaxGet() {
        return "/AJAX/ajaxMap";
    }
}
