package DP6;

public class ConservativePortfolioFactory implements InvestmentPortfolioFactory{

	@Override
	public Stocks createStockInvestment() {
		return new ConservativeStockInvestment();
	}

	@Override
	public Bonds createBondInvestment() {
		// TODO Auto-generated method stub
		return new ConservativeBondInvestment();
	}

}
