package DP8;

public class NSE {
	public double getPrice(String Symbol) {
		
		return 105.00;
	}
	
	public void executeTrade(String Symbol, int quantity, double price) {
		System.out.println("Trade executed on NSE for " + Symbol + " x " + quantity + " shares at price " + price);
	}
}
