// Faster version than my first attempt below this one. Same number of for-loops, but the operations can be done with less if statements.
class Solution {
    public int maxProfit(int[] prices) {
        
        int maxValue = Integer.MAX_VALUE;
        int finalValue = 0;
        int maxRange = 0;
        
        for(int i = 0; i < prices.length; i++) {
            
            if(prices[i] < maxValue) {
                maxValue = prices[i];
            }
            
            maxRange = prices[i] - maxValue;
            
            // The finalValue will be zero unless maxRange is larger than 0.
            if(finalValue < maxRange) {
                finalValue = maxRange;
            }
        }
        
        return finalValue;
    }
}




// Naive single for-loop solution. 
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
