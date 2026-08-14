class Solution {
    public void sortColors(int[] nums) {
        int ones =0;
        int zeroes =0;
        int twos =0;
        for(int x:nums){
            if(x==0){
                zeroes++;
            }
            else if(x==1){
                ones++;
            }
            else{
                twos++;
            }
        }
        for(int i =0;i<nums.length;i++){
            if(i<zeroes){
                nums[i]=0;
            }
            else if(i<zeroes + ones){
                nums[i]=1;
            }
            else{
                nums[i]=2;
            }
        }
    }
}