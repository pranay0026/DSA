class Solution {
    public String reverseVowels(String s) {
        String vowels="AEIOUaeiou";
        int l=0,r=s.length()-1;
        char[] ch=s.toCharArray();
        while(l<r){
            while(l<r && vowels.indexOf(ch[l])==-1){
                l++;
            }
            while(l<r && vowels.indexOf(ch[r])==-1){
                r--;
            }
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        return new String(ch);
    }
}