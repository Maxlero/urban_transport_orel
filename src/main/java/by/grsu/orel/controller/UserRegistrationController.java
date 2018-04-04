package by.grsu.orel.controller;

import by.grsu.orel.model.User;
import by.grsu.orel.service.UserService;
import by.grsu.orel.DataTransferObject.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	@Autowired
	private UserService userService;

	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}

	@GetMapping
	public String showRegistrationForm(Model model) {
		return "registration";
	}

	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") @Valid UserRegistrationDto userDto,
									  BindingResult result) {

		User existing = userService.findByUsername(userDto.getUsername());
		if (existing != null) {
			result.rejectValue("username", null, "That username is taken. Try another.");
		}

		if (result.hasErrors()) {
			return "registration";
		}

		userService.save(userDto);
		return "redirect:/registration?success";
	}

}
