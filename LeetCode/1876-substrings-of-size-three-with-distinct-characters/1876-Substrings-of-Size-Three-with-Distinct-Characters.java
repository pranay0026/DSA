class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<3;i++){
            if(i<s.length()){
                hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            }
        }
        int ans=0;
        if(hm.size()==3) ans++;
        int start=0;
        for(int i=3;i<s.length();i++){
            hm.put(s.charAt(start),hm.get(s.charAt(start))-1);
            if(hm.get(s.charAt(start))==0){
                hm.remove(s.charAt(start));
            }
            start++;
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            if(hm.size()==3) ans++;
        }
        return ans;
    }
}