class Solution {
    public void com(int index,int target,int[] arr,List<List<Integer>> ans,List<Integer> ds){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[index]<=target){
            ds.add(arr[index]);
            com(index,target-arr[index],arr,ans,ds);
            ds.remove(ds.size()-1);
        }
        com(index+1,target,arr,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        com(0,target,nums,res,new ArrayList<>());
        return res;
    }
}
