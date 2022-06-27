class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> nums_dict = new HashMap<Integer, Integer>();
        
        int currentKey;
        
        for (int i = 0; i < nums.length; i++) {
            currentKey = nums[i];
            if (nums_dict.containsKey(currentKey)) {
                return true;
            }
            else {
                nums_dict.put(currentKey, currentKey);
            }
        }
        
        return false;
        
    }
}
