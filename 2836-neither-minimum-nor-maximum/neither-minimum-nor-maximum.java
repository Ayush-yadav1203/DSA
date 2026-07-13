class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int n=(nums.length/2);
        if(nums.length>2){
            return nums[n];
        }
        return -1;
    }
}