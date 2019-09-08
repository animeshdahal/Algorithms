/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit.
 * You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 */


public class BuySellStocks {
    public static void main(String[] args) {
        BuySellStocks remove = new BuySellStocks();
        int[] array = {1, 7};
        System.out.println(remove.maxProfit(array));
    }

    /**
     * Best Solution Time: O(n), Space: O(1)
     */

    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }

    /**
     * Peak-Valley Algorithm solution Solution Time: O(n), Space: O(1)
     */

//    public int maxProfit(int[] prices) {
//        int i = 0;
//        int valley = prices[0];
//        int peak = prices[0];
//        int maxprofit = 0;
//        while (i < prices.length - 1) {
//            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
//                i++;
//            valley = prices[i];
//            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
//                i++;
//            peak = prices[i];
//            maxprofit += peak - valley;
//        }
//        return maxprofit;
//    }


    /**
     * Brute force solution Solution Time: O(n-to-the-power-n), Space: O(n) (because of recursion)
     */

//    public int maxProfit(int[] prices) {
//        return calculate(prices, 0);
//    }
//
//    public int calculate(int prices[], int s) {
//        if (s >= prices.length)
//            return 0;
//        int max = 0;
//        for (int start = s; start < prices.length; start++) {
//            int maxprofit = 0;
//            for (int i = start + 1; i < prices.length; i++) {
//                if (prices[start] < prices[i]) {
//                    int profit = calculate(prices, i + 1) + prices[i] - prices[start];
//                    if (profit > maxprofit)
//                        maxprofit = profit;
//                }
//            }
//            if (maxprofit > max)
//                max = maxprofit;
//        }
//        return max;
//    }
}

