class Solution {
    public int subsetXORSum(int[] nums) {
        return solve(nums,0,0);
    }
    int solve(int[] nums,int id,int xor){
        if(id==nums.length){
            return xor;
        }
        int take=solve(nums,id+1,xor^nums[id]);
        int skip=solve(nums,id+1,xor);
        return take+skip;
    }
}