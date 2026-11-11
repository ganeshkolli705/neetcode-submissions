class Solution {
    public boolean check(int[] nums,int k,int max){
        int sum =0;
        int count =1;
        for(int x:nums){
            if(sum+x<=max){
                sum+=x;
            }
            else{
                count++;
                sum=x;
            }
        }
        return count<=k;
    }
    public int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int sum =0;
        for(int x:nums){
            low = Math.max(x,low);
            sum+=x;
        }
        int high = sum;
        int ans =  sum;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(check(nums,k,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}