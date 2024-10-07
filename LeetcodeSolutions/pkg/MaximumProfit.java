public class MaximumProfit {
    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice=prices[0];

        for(int i=0;i<prices.length;i++){
            maxProfit=Math.max((prices[i]-minPrice),maxProfit);
            minPrice=Math.min(prices[i],minPrice);
        }
        return maxProfit;
    }


    public static void main(String[] args){
        int nums[]={7,1,5,3,4};
        System.out.println(maxProfit(nums));
    }

}
