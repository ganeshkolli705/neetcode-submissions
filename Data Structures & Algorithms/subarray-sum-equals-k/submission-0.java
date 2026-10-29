class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);
        int sum=0;
        int res =0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
            res+=hash.getOrDefault(sum-k,0);
            hash.put(sum,hash.getOrDefault(sum,0)+1);
        }
        return res;
    }
}