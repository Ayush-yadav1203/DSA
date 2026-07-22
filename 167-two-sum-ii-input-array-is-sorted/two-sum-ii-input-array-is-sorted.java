class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        // for(int i=0;i<nums.length;i++){
        //     int j=i+1;
        //     while(j<nums.length){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i+1,j+1};
        //         }
        //         j++;
        //     }
        // }
        // return new int[]{};

        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
}