// To solve bottom-up, I'll find the base case, then account for an increse in n.
class Solution {
    public int climbStairs(int n) {
        
        int[] totalVariations = new int[n + 1];
        totalVariations[0] = 1;
        totalVariations[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            totalVariations[i] = totalVariations[i - 1] + totalVariations[i - 2];
        }
        

        return totalVariations[n];
    }
}
