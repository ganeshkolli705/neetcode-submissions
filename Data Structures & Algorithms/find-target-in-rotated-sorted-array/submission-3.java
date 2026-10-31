class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            //mid value 
            int mid = low +(high-low)/2;
            //return index if found 
            if(nums[mid]==target){
                return mid;
            }
            //if the left array is sorted 
            if(nums[low]<=nums[mid]){
                //the target element is between leftmost and mid value in array
                if(target>=nums[low] && target<nums[mid]){
                    //shift the high
                    high = mid-1;
                }
                else{
                    //else not in this region
                    low = mid+1;
                }
            }
            else{
                // if the value is in between mid and rightmost value
                if(target>nums[mid] && target<=nums[high]){
                    //shift the low to next mid
                    low = mid+1;
                }
                else{
                    //not int this range
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}