class Solution {
    public int trap(int[] height) {
        int water =0;
        int leftmax=height[0];
        int rightmax =height[height.length-1];
        int i =0;
        int j = height.length-1;
        while(i<j){
            if(leftmax<rightmax){
                i++;
                leftmax = Math.max(leftmax,height[i]);
                water+=leftmax-height[i];
            }
            else{
                j--;
                rightmax = Math.max(rightmax,height[j]);
                water+=rightmax-height[j];
            }
        }
        return water;
    }
}
