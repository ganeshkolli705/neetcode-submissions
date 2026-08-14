class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int[] hash = new int[n];
        int j =0;
        for(int i =0;i<n;i++){
            if(nums[i]!=val){
                hash[j++]=nums[i];
            }
        }
        for(int i =0;i<j;i++){
            nums[i]=hash[i];
        }
        return j;
    }
}