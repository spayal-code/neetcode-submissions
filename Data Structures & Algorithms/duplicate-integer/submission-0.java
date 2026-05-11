class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums == null || nums.length <= 1)return false;
        HashSet<Integer> seen = new HashSet<>();
        for(int v : nums){
            if(seen.contains(v))return true;
            seen.add(v);
        }
        return false;
    }
} 