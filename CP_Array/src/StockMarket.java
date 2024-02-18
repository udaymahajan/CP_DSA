public class StockMarket {
    static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int price: prices) {
            minPrice = Math.min(price, minPrice);
            maxProfit = Math.max(maxProfit, price-minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{12,23,11,55,22}));

    }
}
