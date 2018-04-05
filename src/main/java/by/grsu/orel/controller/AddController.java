package by.grsu.orel.controller;

import by.grsu.orel.Starter;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/add")
public class AddController {

	private static final Logger logger = Logger.getLogger(Starter.class);

	@RequestMapping(method = RequestMethod.GET)
	public String start(Model model) {
		return "add";
	}
}
