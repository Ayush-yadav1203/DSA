class Solution {
    public int pivotIndex(int[] nums) {
        
        // int k = 0;
        // while (k < nums.length) {
        //     int left = 0;
        //     int right = 0;
        //     for (int i = 0; i < k; i++) {
        //         left += nums[i];
        //     }
        //     for (int i = k + 1; i < nums.length; i++) {
        //         right += nums[i];
        //     }
        //     if (right == left) {
        //         return k;
        //     } else {
        //         k++;
        //     }
        // }
        // return -1;
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(left==total-left-nums[i]) 
                return i;
            left+=nums[i];
        }
        return -1;
    }
}