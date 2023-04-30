package DP6;

public class AggressivePortfolioFactory implements InvestmentPortfolioFactory{

	@Override
	public Stocks createStockInvestment() {
		return new AggressiveStockInvestment();
	}

	@Override
	public Bonds createBondInvestment() {
		return new AggressiveBondInvestment();
	}

}
