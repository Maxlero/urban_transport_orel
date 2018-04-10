package by.grsu.orel.controller.AJAX;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ajaxTime")
public class AjaxTimeController {
	@GetMapping
	public String ajaxGet() {
		return "/AJAX/ajaxTime";
	}
}
