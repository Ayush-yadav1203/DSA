class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
    void backtrack(int[] nums,int target,int start,List<Integer> list ,List<List<Integer>> ans ){
        if(target==0){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(nums[i]>target){
                continue;
            }
            list.add(nums[i]);
            backtrack(nums,target-nums[i],i,list,ans);
            list.remove(list.size()-1);
        }
    }
}