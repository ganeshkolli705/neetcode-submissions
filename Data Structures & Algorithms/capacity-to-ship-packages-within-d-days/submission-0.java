class Solution {
    public boolean check(int[] weights,int days,int capacity){
        int count =1;
        int current = capacity;
        for(int x:weights){
            if(current-x<0){
                count++;
                if(count>days){
                    return false;
                }
                current = capacity;
            }
            current-=x;
        }
        return count<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max =0;
        int sum =0;
        for(int x:weights){
            max = Math.max(max,x);
            sum+=x;
        }
        int ans = 0;
        while(max<=sum){
            int mid = max + (sum-max)/2;
            if(check(weights,days,mid)){
                ans = mid;
                sum = mid-1;
            }
            else{
                max = mid +1;
            }
        }
        return ans;
    }
}