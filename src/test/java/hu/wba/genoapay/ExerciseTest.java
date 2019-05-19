package hu.wba.genoapay;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise {

    @Test
    public void getMaxProfitReturnsMaximumProfit() {
        int[] stockPrices = {10, 7, 5, 8, 11, 9};
        assertEquals(6, new Exercise().getMaxProfit(stockPrices));
    }
}
