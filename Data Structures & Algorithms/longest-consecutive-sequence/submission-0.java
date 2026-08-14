class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> it = new HashSet<>();
        for(int x:nums){
            it.add(x);
        }
        int max =0;
        for(int i =0;i<nums.length;i++){
            int l =0;
            int value = nums[i];
            if(!it.contains(value-1)){
                int d =value;
                while(it.contains(d)){
                    d++;
                    l++;
                }
            }
            max = Math.max(l,max);
        }
        return max;
    }
}
