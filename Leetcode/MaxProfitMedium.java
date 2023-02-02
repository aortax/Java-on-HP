public class MaxProfitMedium {
    public static void main(String[] args) {
        int[] a = { 7, 1, 5, 3, 6, 4 };
        int[] b = { 1, 2, 3, 4, 5 };
        int[] c = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(a));
        System.out.println(maxProfit(b));
        System.out.println(maxProfit(c));

    }

    /*You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
    
    On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
    
    Find and return the maximum profit you can achieve.
    Example 1:
    
    Input: prices = [7,1,5,3,6,4]
    Output: 7
    Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
    Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
    Total profit is 4 + 3 = 7.
    
    Example 2:
    
    Input: prices = [1,2,3,4,5]
    Output: 4
    Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
    Total profit is 4.
    
    Example 3:
    
    Input: prices = [7,6,4,3,1]
    Output: 0
    Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
    
    
    
    Constraints:
    
    1 <= prices.length <= 3 * 104
    0 <= prices[i] <= 104 */
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1])
            {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

}

/*    public static int maxProfit(int[] prices) {
        int profit = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            max = Math.max(prices[i] - min, max);
            if (prices.length - 1 > i) {
                if (prices[i + 1] < prices[i]) {
                    min = Integer.MAX_VALUE;
                    profit += max;
                    max = 0;
                }
            } else {
                profit += max;
            }
        }
        return profit;
    }

            System.out.println("The min is " + min);
            System.out.println("The profit is " + profit);
            System.out.println("The index is " + i + " The min is " + min + " The max is " + max + " The profit is " + profit);

 */