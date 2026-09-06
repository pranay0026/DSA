class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> res=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[] element=intervals[0];
        res.add(element);
        for(int i=0;i<intervals.length;i++){
            if(element[1]>=intervals[i][0]){
               element[1]=Math.max(element[1],intervals[i][1]);
            }
            else{
                element=intervals[i];
                res.add(element);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}