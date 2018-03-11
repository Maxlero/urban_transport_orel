package by.grsu.orel;

import org.springframework.data.repository.CrudRepository;

import by.grsu.orel.Entity.Stop;

// This will be AUTO IMPLEMENTED by Spring into a Bean called StopRepository
// CRUD refers Create, Read, Update, Delete

/**
 * A DAO for the entity User is simply created by extending the CrudRepository
 * interface provided by spring. The following methods are some of the ones
 * available from such interface: save, delete, deleteAll, findOne and findAll.
 * The magic is that such methods must not be implemented, and moreover it is
 * possible create new query methods working only by defining their signature!
 *
 */

public interface StopRepository extends CrudRepository<Stop, Long> {

}
