package DP8;

public class Main {
    public static void main(String[] args) {
        // Initialize BSE and NSE adapters
        BSEAdapter bseAdapter = new BSEAdapter(new BSE());
        NSEAdapter nseAdapter = new NSEAdapter(new NSE());

        // Initialize the trade aggregator with the BSE and NSE adapters
        TradeAggregator tradeAggregator = new TradeAggregator(bseAdapter, nseAdapter);

        // Execute a trade
        tradeAggregator.executeTrade("INFY", 100);

        // Execute another trade
        tradeAggregator.executeTrade("TATASTEEL", 50);
    }
}