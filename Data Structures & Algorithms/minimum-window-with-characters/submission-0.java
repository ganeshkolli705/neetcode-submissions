class Solution {
    public boolean check(HashMap<Character, Integer> hash_t, HashMap<Character, Integer> hash_s) {
        for (Map.Entry<Character, Integer> map : hash_t.entrySet()) {
            char ch = map.getKey();
            int freq = map.getValue();

            if (!hash_s.containsKey(ch) || hash_s.get(ch) < freq) {
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        if (s.length() < t.length()){
            return "";
        }
        HashMap<Character, Integer> hash_t = new HashMap<>();
        HashMap<Character, Integer> hash_s = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            hash_t.put(ch, hash_t.getOrDefault(ch, 0) + 1);
        }
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int ansStart = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hash_s.put(ch, hash_s.getOrDefault(ch, 0) + 1);
            while (check(hash_t, hash_s)) {
                if (i - start + 1 < minLen) {
                    minLen = i - start + 1;
                    ansStart = start;
                }
                char remove = s.charAt(start);
                hash_s.put(remove, hash_s.get(remove) - 1);
                if (hash_s.get(remove) == 0) {
                    hash_s.remove(remove);
                }
                start++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(ansStart, ansStart + minLen);
    }
}