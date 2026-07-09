class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int n = nums.length;
        // int[] result = new int[n];

        // int totalProduct = 1;
        // int zeroCount = 0;

       
        // for (int num : nums) {
        //     if (num == 0) {
        //         zeroCount++;
        //     } else {
        //         totalProduct *= num;
        //     }
        // }        
        // for (int i = 0; i < n; i++) {
        //     if (zeroCount > 1) {
        //         result[i] = 0;   
        //     }
        //     else if (zeroCount == 1) {
               
        //         if (nums[i] == 0) {
        //             result[i] = totalProduct;
        //         } else {
        //             result[i] = 0;
        //         }
        //     }
        //     else {    
        //         result[i] = totalProduct / nums[i];
        //     }
        // }

        // return result;
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=suffix;
            suffix*=nums[i];
        }
        return ans;

    }
}