package DP4;

import java.util.HashMap;
import java.util.Map;

public class TransportationRouteFactory {
	private Map<String, TransportationRoutes> routes = new HashMap<>();
	
	public TransportationRoutes getRoute(String source, String dt, int distances) {
		String key = source + "_" + dt;
		TransportationRoutes route = routes.get(key);
		if(route == null) {
			route = new Route(source, dt, distances);
			routes.put(key, route);
		}
		return route;
	}
}
