class KthLargest {
    PriorityQueue<Integer> it= new PriorityQueue<>();
    int v ;
    public KthLargest(int k, int[] nums) {
        this.v=k;
        for(int x:nums){
            add(x);
        }
    }
    
    public int add(int val) {
        it.offer(val);
        if(it.size()>v){
            it.poll();
        }
        return it.peek();
    }
}
