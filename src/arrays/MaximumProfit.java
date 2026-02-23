package arrays;


public class MaximumProfit {

    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }
        // declare variables
        int maxProfit = 0;
        int minPrice = prices[0];
        int profit = 0;

        // for loop in order to get max

        for (int i = 0; i < prices.length; i++){
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        profit = prices[i] - minPrice;
        if (profit > maxProfit) {
            maxProfit = profit;
        }
    }


    return maxProfit;
}

    // this is only for calling the class
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}