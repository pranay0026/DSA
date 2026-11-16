class Solution {
    public int minGroups(int[][] intervals) {
        int arrival=0;
        int dept=0;
        int arrivalArr[]=new int[intervals.length];
        int deptArr[]=new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            arrivalArr[i]=intervals[i][0];
            deptArr[i]=intervals[i][1];
        }
        Arrays.sort(arrivalArr);
        Arrays.sort(deptArr);
        int platform=0;
        int ans=0;
        while(arrival<arrivalArr.length){
            if(arrivalArr[arrival]<=deptArr[dept]){
                platform++;
                ans=Math.max(platform,ans);
                arrival++;
            }
            else{
                platform--;
                dept++;
            }
        }
        return ans;
    }
}