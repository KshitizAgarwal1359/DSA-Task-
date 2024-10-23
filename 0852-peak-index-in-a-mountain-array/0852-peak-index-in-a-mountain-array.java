class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int first=0;
        int n = arr.length;
        int last=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]>last){
                last=arr[i];
                index=i;
            }
        }
        return index;
    }
}