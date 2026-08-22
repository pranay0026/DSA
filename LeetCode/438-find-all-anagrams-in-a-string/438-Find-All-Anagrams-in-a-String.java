class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length()){
            return new ArrayList<>();
        }
        List<Integer> res=new ArrayList<>();
        int[] arr=new int[26];
        int size=p.length();
        for(int i=0;i<size;i++){
            arr[p.charAt(i)-'a']++;
        }
        int[] arr2=new int[26];
        for(int i=0;i<size;i++){
            arr2[s.charAt(i)-'a']++;
        }
        boolean ans=checker(arr,arr2,p);
        if(ans) res.add(0);
        int start=0;
        for(int i=size;i<s.length();i++){
            arr2[s.charAt(start)-'a']--;
            arr2[s.charAt(i)-'a']++;
            ans=checker(arr,arr2,p);
            if(ans) res.add(start+1);
            start++;
        }
        return res;

    }
    boolean checker(int[] arr1,int[] arr2,String p){
        for(int i=0;i<p.length();i++){
            if(arr1[p.charAt(i)-'a']!=arr2[p.charAt(i)-'a']){
                return false;
            }
        }
        return true;
    }
}