package DP8;

public class BSE {
	public double getPrice(String Symbol) {
		return 100;
	}
	
	public void executeTrade(String Symbol, int quantity, double price) {
		System.out.println("Trade executed on BSE for " + Symbol + " x " + quantity + " shares at price " + price);
	}
}
