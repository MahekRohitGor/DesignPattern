package DP7;

public class Main {

	public static void main(String[] args) {
		ConcreteNetworkTraffic networkTraffic = new ConcreteNetworkTraffic();
        networkTraffic.attachObserver(new CyberAttackDetector("SQL Injection"));
        networkTraffic.attachObserver(new CyberAttackDetector("Cross-site Scripting"));

        // Simulate incoming network traffic and notify all observers
        networkTraffic.simulateIncomingTraffic();

	}

}
