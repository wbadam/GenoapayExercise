package hu.wba.genoapay;

public class Exercise {

    /**
     * Returns the maximum profit that can be made from the given stock prices. Throws {@link IllegalArgumentException}
     * if stock prices are invalid.
     *
     * @param stockPrices an array of stock prices as positive integers
     * @return maximum profit that can be made, or -1 if no profit can be made
     */
    public int getMaxProfit(int[] stockPrices) {

        int profit = -1;
        int buy = Integer.MAX_VALUE;
        int sell = 0;

        // Iterate through stock prices
        for (int price : stockPrices) {

            if (price <= 0) {
                throw new IllegalArgumentException("Stock price must be a positive integer.");
            }

            if (price <= buy) {
                // If current price is not higher than the buying price, start searching for profit from this minute.
                // Calculate highest profit so far, set current as buying price, and reset selling price.
                profit = Math.max(profit, sell - buy);
                buy = price;
                sell = 0;
            } else if (price > sell) {
                // If in the next minute the price is higher than the current highest selling price, update the selling
                // price and calculate the profit.
                sell = price;
                profit = Math.max(profit, sell - buy);
            }
        }

        return profit;
    }
}
