package by.grsu.orel.model;

import com.google.gson.Gson;

import javax.persistence.*;

@Entity
public class Routes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	private String route;

	public Route[] getRoutes() {
		Gson gson = new Gson();

		return gson.fromJson(route, Route[].class);
	}

	//	for debug
	@Override
	public String toString() {
		return "Routes [id=" + id + ", name=" + name + ", route=" + route + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}
}
