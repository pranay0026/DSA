class Solution {
    public String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        String w1=arr[0];
        String w2=arr[arr.length-1];
        int n=Math.min(w1.length(),w2.length());
        String ans="";
        for(int i=0;i<n;i++){
            if(w1.charAt(i)==w2.charAt(i)){
                ans+=w1.charAt(i);
            }
            else{
                break;
            }
        }
        return ans;
    }
}