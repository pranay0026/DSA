class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        HashMap<Character,String> hm=new HashMap<>();
        hm.put('0',"");
        hm.put('1',"");
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        recur(res,hm,digits,new StringBuilder(),0);
        return res;
    }
    public void recur(List<String> res,HashMap<Character,String> hm,String digit,StringBuilder word,int index){
        if(index==digit.length()){
            res.add(word.toString());
            return;
        }
        char str=digit.charAt(index);
        if(str=='0' || str=='1'){
            recur(res,hm,digit,word,index+1);
            return;
        }
        String letters=hm.get(str);
        for(char ch:letters.toCharArray()){
            word.append(ch);
            recur(res,hm,digit,word,index+1);
            word.deleteCharAt(word.length()-1);
        }
    }
}