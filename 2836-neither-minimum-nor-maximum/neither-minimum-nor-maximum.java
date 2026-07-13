class Solution {
    public int findNonMinOrMax(int[] nums) {
        // Arrays.sort(nums);
        // int n=(nums.length/2);
        // if(nums.length>2){
        //     return nums[n];
        // }
        // return -1;

        // int n=nums.length;
        // int min=Integer.MAX_VALUE;
        // int max=Integer.MIN_VALUE;
        // if(n<=2) return -1;
        // for(int num:nums){
        //     min=Math.min(min,num);
        //     max=Math.max(max,num);
        // }
        // for(int num:nums){
        //     if(num!=min && num!=max){
        //         return num;
        //     }

        // }
        // return -1;

        if(nums.length<=2) return -1;
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        return a+b+c-Math.min(a,Math.min(b,c))-Math.max(a,Math.max(b,c));
    }
}