package DP8;

public class BSEAdapter implements TradingSystem{
	private BSE bse;
	public BSEAdapter(BSE bse) {
		this.bse = bse;
	}

	@Override
	public double getPrice(String Symbol) {
		return bse.getPrice(Symbol);
	}

	@Override
	public void executeTrade(String Symbol, int quantity, double price) {
		bse.executeTrade(Symbol, quantity, price);
		
	}

}
