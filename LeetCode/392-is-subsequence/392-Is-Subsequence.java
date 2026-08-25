class Solution {
    public boolean isSubsequence(String s, String t) {
        int m=s.length();
        int n=t.length();
        int i=0,j=0;
        while(i<n && j<m){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
            i++;
        }
        return j==m;
    }
}