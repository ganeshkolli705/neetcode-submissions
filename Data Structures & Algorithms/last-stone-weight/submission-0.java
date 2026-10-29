class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> it = new PriorityQueue<>(Collections.reverseOrder());
        for(int x:stones){
            it.offer(x);
        }
        while(it.size()>1){
            it.offer(it.poll()-it.poll());
        }
        return it.poll();
    }
}
