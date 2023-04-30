package DP7;

import java.util.ArrayList;
import java.util.List;

public class ConcreteNetworkTraffic implements NetworkTraffic{
	
	List<NetworkTrafficObserver> observers = new ArrayList<>();

	@Override
	public void attachObserver(NetworkTrafficObserver observer) {
		observers.add(observer);
		
	}

	@Override
	public void detachObserver(NetworkTrafficObserver observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObserver(String packet) {
		for(NetworkTrafficObserver observer: observers) {
			observer.update(packet);
		}
		
	}
	
	public void simulateIncomingTraffic() {
		String[] packets = {"Packet 1 SQL Injection", "Packet 2", "Packet 3", "Packet 4", "Packet 5"};
		for(String p: packets) {
			System.out.println("Incoming packet: " + p);
			notifyObserver(p);
		}
	}

}
