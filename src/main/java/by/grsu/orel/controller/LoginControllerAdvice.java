package by.grsu.orel.controller;

import by.grsu.orel.model.User;
import by.grsu.orel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class LoginControllerAdvice {
    @Autowired
    private UserRepository userRepository;

    @ModelAttribute
    public void addBugetToModel(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();

        if (!username.equals("anonymousUser")) {
            User user = userRepository.findByUsername(username);

            model.addAttribute("account", user);
            model.addAttribute("authorized", true);
        } else {
            model.addAttribute("authorized", false);
        }
    }
}