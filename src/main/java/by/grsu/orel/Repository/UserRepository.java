package by.grsu.orel.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import by.grsu.orel.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);

    User findByConfirmationToken(String confirmationToken);
}
