class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int r=i;r<n;r++){
                if(nums[r]==target){
                    count++;
                }
                int l=r-i+1;
                if(count>l/2){
                    ans++;
                }
            }
        }
        return ans;
    }
}