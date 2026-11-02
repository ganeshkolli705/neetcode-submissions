class Solution {
    public void com(int index,int[] nums,List<List<Integer>> res,List<Integer> temp){
        if(index==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(index>nums.length){
            return;
        }
        temp.add(nums[index]);
        com(index+1,nums,res,temp);
        temp.remove(temp.size()-1);
        com(index+1,nums,res,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> it = new ArrayList<>();
        com(0,nums,it,new ArrayList<>());
        return it;
    }
}