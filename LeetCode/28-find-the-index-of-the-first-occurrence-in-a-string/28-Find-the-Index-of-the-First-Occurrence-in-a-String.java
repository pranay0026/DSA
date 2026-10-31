class Solution {
    public int strStr(String haystack, String needle) {
        int len=needle.length();
        for(int right=0;right<haystack.length();right++){
            char c=haystack.charAt(right);
            if(needle.charAt(0)==c && right+len<=haystack.length()){
                if(haystack.substring(right,right+len).equals(needle)){
                    return right;
                }
            }
        }
        return -1;
    }
}