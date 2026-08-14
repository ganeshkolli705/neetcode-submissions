class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (k % 2 == 0) {
                sb.append(word1.charAt(i));
                i++;
                k++;
            } else {
                sb.append(word2.charAt(j));
                j++;
                k++;
            }
        }
        while (i < n) {
            sb.append(word1.charAt(i));
            i++;
        }

        while (j < m) {
            sb.append(word2.charAt(j));
            j++;
        }
        String res = sb.toString();
        return res;
    }
}