public class MaxProfitWithCoolDown {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 0, 2 };
        int[] b = { 1 };
        int[] c = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(a));
        System.out.println(maxProfit(b));
        System.out.println(maxProfit(c));

    }

    /*You are given an array prices where prices[i] is the price of a given stock on the ith day.
    
    Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:
    
    After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
    Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
    
    Example 1:
    
    Input: prices = [1,2,3,0,2]
    Output: 3
    Explanation: transactions = [buy, sell, cooldown, buy, sell]
    
    Example 2:
    
    Input: prices = [1]
    Output: 0
    Constraints:
    
    1 <= prices.length <= 5000
    0 <= prices[i] <= 100
     */
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int soldDay;
        for(int i = prices.length -1 ; i > 0; i--)
        {
            if(prices[i] > prices[i-1])
        }
    }

}
