// Constant time complexity solution for the two sum problem.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visitedNums = new HashMap<>();
        
        for(int i=0; i < nums.length; i++) {
            
            // if we find another index that adds up to target return in array. 
            if (visitedNums.containsKey(target - nums[i])) {
               return new int[] {visitedNums.get(target - nums[i]), i};
            }
            // Add the ith element and its index into hashmap each loop.
            visitedNums.put(nums[i], i);
                   
        }
        
    throw new IllegalArgumentException("no match found!");

    }
}
