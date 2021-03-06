package by.grsu.orel.controller;

import by.grsu.orel.Starter;
import by.grsu.orel.model.Routes;
import by.grsu.orel.repository.RouteRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for `/routes` page
 */
@Controller
@RequestMapping("/routes")
public class RoutesController {

    private static final Logger logger = Logger.getLogger(Starter.class);

    @Autowired // This means to get the bean called routeRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private RouteRepository routeRepository;

    @PostMapping
    public String deleteRouteForm(@RequestParam Long id, Model model) {
        logger.info(id);

        try {
            Routes route = new Routes();
            route.setId(id);
            routeRepository.delete(route);
        } catch (Exception ex) {
            logger.info("Error while deleting the route:" + ex.toString());
        }
        logger.info("Route successfully deleted!");


        Iterable<Routes> routesObject = routeRepository.findAll();
        model.addAttribute("routes", routesObject);
        return "routes";
    }

    @GetMapping
    public String showRoutesForm(Model model) {
//		Route[] mmm = new Route[3];
//
//		for (int i = 0; i < mmm.length; i++) {
//			mmm[i] = new Route();
//			mmm[i].setX(0.001f * i);
//			mmm[i].setY(0.002f * i);
//			mmm[i].setTime(0);
//			mmm[i].setStop(false);
//		}
//
//		Gson gson = new Gson();
//		logger.info(gson.toJson(mmm, Route[].class));

        Iterable<Routes> routesObject = routeRepository.findAll();
        model.addAttribute("routes", routesObject);

//		for (Routes r : routesObject) {
//			logger.info(r);
//		}


        return "routes";
    }
}
