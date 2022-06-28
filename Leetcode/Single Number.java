// Naive solution

class Solution {
    public int singleNumber(int[] nums) {
        
        Map<Integer, Integer> visitedNums = new HashMap<>();
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            
            if (visitedNums.containsKey(nums[i])) {
                visitedNums.remove(nums[i]);
            } 
            else {
                visitedNums.put(nums[i], i);
            }
        }
        System.out.println(visitedNums);
        
        Set<Integer> keys = visitedNums.keySet();
        for (Integer key : keys) {
            tmp = key;
            
        }
        System.out.println(tmp);
        return tmp;
    }
}
