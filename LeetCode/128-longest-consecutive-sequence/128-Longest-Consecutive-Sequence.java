class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1){ return 1;}
        if(nums.length==0) return 0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        int wc=1;
        for(int i:hs){
            
            if(!hs.contains(i-1)){
                int size=1;
                int j=i;
                while(hs.contains(j+1)){
                    wc=Math.max(++size,wc);
                    j+=1;
                }
            }
        }
        return wc;
    }
}