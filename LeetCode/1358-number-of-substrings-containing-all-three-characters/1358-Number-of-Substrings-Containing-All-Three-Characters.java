class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=0,cc=0;
        for(int r=0;r<s.length();r++){
            hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);
            while(hm.size()==3){
                cc+=s.length()-r;
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                if(hm.get(s.charAt(l))==0){
                    hm.remove(s.charAt(l));
                }
                l++;
            }
        }
        return cc;
    }
}