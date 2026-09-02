class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(arr);
        int min_value=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]<min_value) min_value=arr[i]-arr[i-1];
        }
        for(int i=1;i<arr.length;i++){
            List<Integer> pair=new ArrayList<>();
            if(arr[i]-arr[i-1]==min_value) {
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                res.add(pair);
            }
        }
        return res;
    }
}