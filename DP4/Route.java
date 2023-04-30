package DP4;

public class Route implements TransportationRoutes{
	String dest, source;
	int distance;
	
	public Route(String dest, String source, int distance) {
		this.source = source;
		this.dest = dest;
		this.distance = distance;
	}

	@Override
	public void setDestination(String dest) {
		this.dest = dest;
	}

	@Override
	public void setSource(String source) {
		this.source = source;
		
	}

	@Override
	public void CalCost(int weight) {
		int cost = distance*weight;
		System.out.printf("The cost of transporting " + weight + " kg from " + source + " to " + dest + " Rs. " + cost +"\n");
		
	}

}
