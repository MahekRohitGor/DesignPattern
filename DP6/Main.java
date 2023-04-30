package DP6;

public class Main {

	public static void main(String[] args) {
		InvestmentPortfolioFactory p1 = new ConservativePortfolioFactory();
		InvestmentPortfolioFactory p2 = new AggressivePortfolioFactory();
		Stocks conservativeStock = p1.createStockInvestment();
		Bonds conservativeBond = p1.createBondInvestment();
		
		Stocks aggressiveStock = p2.createStockInvestment();
		Bonds aggressiveBond = p2.createBondInvestment();
		
		aggressiveStock.buy();
		conservativeStock.buy();
		aggressiveBond.sell();
		conservativeBond.sell();
		
		
		
	}

}
