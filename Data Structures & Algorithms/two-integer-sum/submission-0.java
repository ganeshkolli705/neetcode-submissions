class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> it = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int complement = target-nums[i];
            if(it.containsKey(complement)){
                return new int[]{it.get(complement),i};
            }
            it.put(nums[i],i);
        }
        return new int[]{};
    }
}
