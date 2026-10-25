class Solution {
    public int[] searchRange(int[] arr, int target) {
        if(arr.length==1 && arr[0]==target) return new int[]{0,0};
        int low=0;
        int high=arr.length-1;
        int[] arm=new int[2];
        for(int i=0;i<2;i++){
            arm[i]=-1;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                arm[0]=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        low=0;high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                arm[1]=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return arm;
    }
}