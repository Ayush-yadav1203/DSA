class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int ans=0;
        for(int num:nums){
            sum+=num;
            ans=Math.min(ans,sum);
        }
        return 1-ans;
    }
}