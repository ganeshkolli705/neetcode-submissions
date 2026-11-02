class Solution {
    public int com(int index,int[] nums,int res){
        if(index==nums.length){
            return res;
        }
        int include =com(index+1,nums,res);
        int dont_include =com(index+1,nums,res^nums[index]);
        return include+dont_include;
    }
    public int subsetXORSum(int[] nums) {
        return com(0,nums,0);
    }
}