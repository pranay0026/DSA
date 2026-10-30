class Solution {
    public boolean lemonadeChange(int[] bills) {
        //int net=0;
        int fc=0,tc=0,bc=0;
        for(int i:bills){
            if(i==5){
                fc++;
            }
            else if(i==10){
                tc++;
                if(fc>=1){
                    fc--;
                }
                else return false;
            }
            else{
                bc++;
                if(fc>=1 && tc>=1){
                    fc--;
                    tc--;
                }
                else if(fc>=3){
                    fc-=3;
                }
                else return false;
            }
        }
        return true;
    }
}