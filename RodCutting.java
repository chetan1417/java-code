public class RodCutting {
    public static int maxProfit(int n, int[] prices) {
        // Base case: If rod length is zero, no profit can be made
        if (n == 0) {
            return 0;
        }
        
        int maxProfit = 0;
        
        // Try all possible cuts from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i <= prices.length) {
                // Recursively find the maximum profit for the remaining length
                int profit = prices[i - 1] + maxProfit(n - i, prices);
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20}; // Example prices
        int n = 8; // Rod length
        
        System.out.println("Maximum Profit: " + maxProfit(n, prices));
    }
}
