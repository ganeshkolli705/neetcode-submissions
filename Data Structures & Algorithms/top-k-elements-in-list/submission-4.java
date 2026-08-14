class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        List<Integer>[] freq = new List[nums.length + 1];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int j = 0;
        for (int i = freq.length - 1; i >= 0 && j < k; i--) {
            for (int num : freq[i]) {
                res[j++] = num;
                if (j == k) {
                    break;
                }
            }
        }
        return res;
    }
}