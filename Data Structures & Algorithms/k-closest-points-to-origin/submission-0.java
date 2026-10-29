class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));
        for (int[] p : points) {
            int dist = p[0] * p[0] + p[1] * p[1];
            pq.offer(new int[] {p[0], p[1], dist});
        }
        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] element = pq.poll();
            res[i][0] = element[0];
            res[i][1] = element[1];
        }
        return res;
    }
}
