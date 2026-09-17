class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int start =0;
        int min =len+1;
        int sum =0;
        for(int i =0;i<len;i++){
            sum+=nums[i];
            while(sum>=target){
                min = Math.min(min,i-start+1);
                sum-=nums[start];
                start++;
            }
        }
        return min==len+1?0:min;
    }
}