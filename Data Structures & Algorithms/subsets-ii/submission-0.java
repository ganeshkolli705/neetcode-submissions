class Solution {
    public void com(int[] nums,int index,List<List<Integer>> res,List<Integer> temp){
        if(index==nums.length){
            if(res.contains(temp)){
                return;
            }
            else{
                res.add(new ArrayList<>(temp));
                return;
            }
        }
        if(index>nums.length){
            return;
        }
        temp.add(nums[index]);
        com(nums,index+1,res,temp);
        temp.remove(temp.size()-1);
        com(nums,index+1,res,temp);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        com(nums,0,res,new ArrayList<>());
        return res;
    }
}