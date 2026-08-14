class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> it = new HashSet<>();
        for(int x:nums){
            if(it.contains(x)){
                return true;
            }
            it.add(x);
        }
        return false;
    }
}