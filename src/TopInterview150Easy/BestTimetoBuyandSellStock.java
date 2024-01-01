package TopInterview150Easy;

public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int tempProfit;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            tempProfit = prices[i] - minPrice;
            if (tempProfit > profit) {
                profit = tempProfit;
            }
        }
        return profit;
    }
}
