package by.grsu.orel.service;

import by.grsu.orel.model.User;
import by.grsu.orel.DataTransferObject.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
	User findByUsername(String username);

	User save(UserRegistrationDto registration);
}
