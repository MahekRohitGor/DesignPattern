package DP8;

public class TradeAggregator {
    private TradingSystem bse;
    private TradingSystem nse;

    public TradeAggregator(TradingSystem bse, TradingSystem nse) {
        this.bse = bse;
        this.nse = nse;
    }

    public void executeTrade(String symbol, int quantity) {
        double bsePrice = bse.getPrice(symbol);
        double nsePrice = nse.getPrice(symbol);

        // Execute the trade on the exchange with the best price
        if (bsePrice < nsePrice) {
            bse.executeTrade(symbol, quantity, bsePrice);
        } else {
            nse.executeTrade(symbol, quantity, nsePrice);
        }
    }
}