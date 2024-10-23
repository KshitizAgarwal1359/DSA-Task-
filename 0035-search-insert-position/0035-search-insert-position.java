class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=0,b=nums.length;
        while(a<b){
            int c=a+(b-a)/2;
            if(target>nums[c])
            a=c+1;
            else
            b=c;
        }
        return a;
        
    }
}