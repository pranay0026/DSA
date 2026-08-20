class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            int cc=1;
            if(i<chars.length-1 && chars[i]==chars[i+1]){
                while(i+1<chars.length && chars[i+1]==ch){
                    cc++;
                    i++;
                }
                sb.append(ch);
                sb.append(cc);
            }
            else{
                sb.append(ch);
            }
        }
        for (int i=0;i<sb.length();i++) {
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}