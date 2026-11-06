class Solution {
    public int com(int idx,List<Integer> it,int target,int[][] dp){
        if(target==0){
            return 1;
        }
        if(idx<0){
            return Integer.MIN_VALUE;
        }
        if(dp[idx][target]!=-1){
            return dp[idx][target];
        }
        int take = Integer.MIN_VALUE;
        if(target>=it.get(idx)){
            int ans = com(idx,it,target-it.get(idx),dp);
            if(ans!=Integer.MIN_VALUE){
                take=it.get(idx)*ans;
            }
        }
        int dont = Integer.MIN_VALUE;
        dont = com(idx-1,it,target,dp);
        return dp[idx][target]=Math.max(take,dont);
    }
    public int integerBreak(int n) {
        ArrayList<Integer> it = new ArrayList<>();
        for(int i=1;i<n;i++){
            it.add(i);
        }
        int[][] dp = new int[it.size()][n+1];
        for(int i =0;i<it.size();i++){
            for(int j =0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        int ans = com(it.size()-1,it,n,dp);
        return ans==Integer.MIN_VALUE?-1:ans;
    }
}