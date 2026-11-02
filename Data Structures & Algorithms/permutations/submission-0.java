class Solution {
    public void com(int[] nums, List<List<Integer>> res, List<Integer> temp) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (temp.contains(nums[i])) {
                    continue;
                }
                temp.add(nums[i]);
                com(nums,res,temp);
                temp.remove(temp.size()-1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        com(nums,res,new ArrayList<>());
        return res;
    }
}