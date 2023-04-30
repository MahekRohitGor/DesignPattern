package DP4;

public class Main {

	public static void main(String[] args) {
		TransportationRouteFactory factory = new TransportationRouteFactory();
		String[] sources = {"Delhi", "Mumbai", "Bhuj", "Ahmedabad", "Surat", "Vadodra", "Gandhinagar"};
		String[] dest = {"Banglore", "Kolkata", "Pune", "Ahmedabad", "Manglore", "Kerala", "Nakhatrana"};
		int[] weights = {1000, 2000, 3000, 6000, 8500, 4500};
		int[] distance = {150, 560, 458, 2014, 500, 600, 450};
		
		for(String source: sources) {
			for(String dt: dest) {
				int distances = distance[getIndex(sources, source)] + distance[getIndex(dest, dt)];
                TransportationRoutes route = factory.getRoute(source, dt, distances);

                for (int weight : weights) {
                    route.CalCost(weight);
                }
			}
		}

	}


private static int getIndex(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
}