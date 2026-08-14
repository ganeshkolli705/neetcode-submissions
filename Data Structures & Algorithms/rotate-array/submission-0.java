class Solution {
    public void rev(int[] nums,int a,int b){
        while(a<b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        if(k==0){
            return;
        }
        else{
            rev(nums,0,n-1);
            rev(nums,0,k-1);
            rev(nums,k,n-1);
        }
    }
}