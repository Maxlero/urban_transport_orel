package by.grsu.orel.repository;

import by.grsu.orel.model.Routes;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called RouteRepository
// Jpa refers Create, Read, Update, Delete

public interface RouteRepository extends CrudRepository<Routes, Long> {
	Routes findById(int id);
	Void deleteRoutesById(int id);
	Void deleteRoutesByName(int name);
}
