class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int max =0;
        int start =0;
        HashSet<Character> it = new HashSet<>();
        for(int i =0;i<len;i++){
            if(!it.contains(s.charAt(i))){
                it.add(s.charAt(i));
            }
            else{
                while(s.charAt(i)!=s.charAt(start)){
                    it.remove(s.charAt(start));
                    start++;
                }
                start++;
                it.add(s.charAt(i));
            }
            max = Math.max(max,i-start+1);
        }
        return max;
    }
}
