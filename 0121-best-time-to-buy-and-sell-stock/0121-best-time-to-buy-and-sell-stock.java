class Solution {
    public int maxProfit(int[] prices) {
        int mincost=Integer.MAX_VALUE;
        int maxprofit=Integer.MIN_VALUE;
        int curr=0;
        int r=0;
        for(int i=0;i<prices.length;i++){
            curr=prices[i];
           mincost=Math.min(mincost,curr);
        
        int profit=prices[i]-mincost;

        if(profit>maxprofit){
            maxprofit=profit;
        }
        
        }
        return maxprofit;
    }   
    
}