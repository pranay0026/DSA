class Solution {
    public boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        s=s.toLowerCase();
        while(l<=r){
            char cl=s.charAt(l);
            char cr=s.charAt(r);
            if(!Character.isLetterOrDigit(cl)){
                l++;
            }
            else if(!Character.isLetterOrDigit(cr)){
                r--;
            }
            else{
                if((cl!=cr))  return false;
                l++;
            r--;
            }
            
        }
        return true;
    }
}