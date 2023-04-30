package DP8;

public interface TradingSystem {
	public double getPrice(String Symbol);
	public void executeTrade(String Symbol, int quantity, double price);
}
