package DP7;

public interface NetworkTraffic {
	void attachObserver(NetworkTrafficObserver observer);
	void detachObserver(NetworkTrafficObserver observer);
	void notifyObserver(String packet);
}
