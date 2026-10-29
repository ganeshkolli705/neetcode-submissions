class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<strs.size();i++){
            sb.append(String.valueOf(strs.get(i).length()));
            sb.append("#");
            sb.append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i =0;
        while(i<str.length()){
            int j =i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            res.add(str.substring(j+1,j+1+length));
            i=length+j+1;
        }
        return res;
    }
}
