package hu.wba.genoapay;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExerciseTest {

    private Exercise exercise = new Exercise();

    @Test
    public void calculatesMaximumProfit() {
        int[] prices = {10, 7, 5, 8, 11, 9};
        assertEquals(6, exercise.getMaxProfit(prices));
    }

    @Test
    public void returnsMinusOneWhenNoProfitPossible() {
        int[] prices = {10, 9, 8, 7, 6, 5};
        assertEquals(-1, exercise.getMaxProfit(prices));
    }

    @Test
    public void returnsMinusOneWhenPricesAreConstant() {
        int[] prices = {10, 10, 10};
        assertEquals(-1, exercise.getMaxProfit(prices));
    }

    @Test
    public void returnsMinusOneWhenInputIsTooShort() {    // No time to sell stock
        int[] prices = {10};
        assertEquals(-1, exercise.getMaxProfit(prices));
    }

    @Test
    public void returnsMinusOneWhenInputIsEmpty() {
        int[] prices = {};
        assertEquals(-1, exercise.getMaxProfit(prices));
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwsExceptionWhenStockPriceInvalid() {
        int[] prices = {10, 12, 0, 8};
        exercise.getMaxProfit(prices);
    }

    @Test
    public void handlesExtremeValues() {
        int[] prices = {Integer.MAX_VALUE, Integer.MAX_VALUE - 2, Integer.MAX_VALUE};
        assertEquals(2, exercise.getMaxProfit(prices));
    }

    @Test
    public void handlesExtremeConstantValues() {
        int[] prices = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertEquals(-1, exercise.getMaxProfit(prices));
    }

    @Test
    public void handlesShortInputWithExtremeValue() {
        int[] prices = {Integer.MAX_VALUE};
        assertEquals(-1, exercise.getMaxProfit(prices));
    }
}
