package DP8;

public class NSEAdapter implements TradingSystem{
	private NSE nse;

    public NSEAdapter(NSE nse) {
        this.nse = nse;
    }

	@Override
	public double getPrice(String Symbol) {
		return nse.getPrice(Symbol);
	}

	@Override
	public void executeTrade(String Symbol, int quantity, double price) {
		nse.executeTrade(Symbol, quantity, price);
		
	}

}
