class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash = new int[26];
        int maxf =0;
        int start =0;
        int maxlen =0;
        for(int i =0;i<s.length();i++){
            hash[s.charAt(i)-'A']++;
            maxf=Math.max(maxf,hash[s.charAt(i)-'A']);
            while((i-start+1)-maxf>k){
                hash[s.charAt(start)-'A']--;
                start++;
            }
            maxlen = Math.max(maxlen,i-start+1);
        }
        return maxlen;
    }
}
