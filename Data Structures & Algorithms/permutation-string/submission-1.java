class Solution {
    public boolean check(int[] hash){
        for(int x:hash){
            if(x!=0){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] hash = new int[26];
        for(int i =0;i<s1.length();i++){
            hash[s1.charAt(i)-'a']++;
            hash[s2.charAt(i)-'a']--;
        }
        if(check(hash)){
            return true;
        }
        for(int i =s1.length();i<s2.length();i++){
            hash[s2.charAt(i-s1.length())-'a']++;
            hash[s2.charAt(i)-'a']--;
            if(check(hash)){
                return true;
            }
        }
        return false;
    }
}
