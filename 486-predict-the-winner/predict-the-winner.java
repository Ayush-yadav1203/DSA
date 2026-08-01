class Solution {
    public boolean predictTheWinner(int[] nums) {
        return sol(nums,0,nums.length-1)>=0;
    }
    static int sol(int[] nums,int left,int right){
        if(left==right){
            return nums[left];
        }
        int pickl=nums[left]-sol(nums,left+1,right);
        int pickr=nums[right]-sol(nums,left,right-1);
        return Math.max(pickl,pickr);
    }
}