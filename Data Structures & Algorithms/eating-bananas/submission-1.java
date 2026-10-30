class Solution {
    public boolean check(int[] piles, int h, int v) {
        if (v == 0){
            return false;
        }
        long count = 0;
        for (int x : piles) {
            int hours = x/v;
            count+=x%v==0?hours:hours+1;
        }
        return count <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int x : piles) {
            max = Math.max(max, x);
        }
        int min = 1;
        int ans = max;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (check(piles, h, mid)) {
                ans = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }
}
