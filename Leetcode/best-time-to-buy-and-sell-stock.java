// Naive single for-loop solution. Faster than 12% of submissions.
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/

class Solution {
    public int maxProfit(int[] prices) {
        
        int lowPoint = prices[0];
        int greatestRange = 0;
        int newRange = 0;
        
        for (int i=0; i < prices.length; i++) {
            
            // If the new number is bigger than the current lowPoint calculate the newRange.
            if (lowPoint < prices[i]) {
                newRange = prices[i] - lowPoint;
                
                // If newRange is greater than greatestRange make greatestRange equal newRange.
                if (newRange > greatestRange) {
                    greatestRange = newRange;
                }
            }
            
            // If the new number is smaller than the current lowPoint, then change the value of lowPoint.
            if (lowPoint > prices[i]) {
                lowPoint = prices[i];
            }   
        }
        
        // If greatestRange is negative make it equal zero as per the instructions.   
        if (greatestRange < 0) {
            greatestRange = 0;
        }
        
        return greatestRange;
    }
}
