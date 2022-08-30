package logic;

public class BestDay {

	public static void main(String[] args) {

		int[] prices = {7,6,4,3,1};
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int profit = 0;
		for(int i=0; i<prices.length-1; i++) {
			int buy = prices[i]*(-1);
			int sell = prices[i+1];
			if(buy + sell > 0) {
				profit += buy + sell;
			}
		}
		return profit;
	}

}
