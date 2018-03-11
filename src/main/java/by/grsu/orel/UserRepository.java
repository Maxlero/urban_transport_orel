package by.grsu.orel;

import org.springframework.data.repository.CrudRepository;

import by.grsu.orel.Entity.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}
