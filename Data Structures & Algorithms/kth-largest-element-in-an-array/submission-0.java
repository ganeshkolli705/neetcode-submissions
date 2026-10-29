class Solution {
    public void add(int value,PriorityQueue<Integer> arr,int k){
        arr.offer(value);
        if(arr.size()>k){
            arr.poll();
        }
    }
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> it = new PriorityQueue<>();
        for(int x:nums){
            add(x,it,k);
        }
        return it.peek();
    }
}
