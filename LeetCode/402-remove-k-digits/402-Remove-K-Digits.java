
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        int rem=k;
        for(char digit:num.toCharArray()){
            while(rem>0 && !st.isEmpty() && st.peek()>digit){
                st.pop();
                rem--;
            }
            st.push(digit);
        }
        while(rem>0 && !st.isEmpty()){
            st.pop();
            rem--;
        }
        StringBuilder sb=new StringBuilder();
        for(char digit:st){
            sb.append(digit);
        }
        int i=0;
        while(i<sb.length() && sb.charAt(i)=='0'){
            i++;
        }
        if(i==sb.length()) return "0";
        return sb.toString().substring(i);
    }
}
