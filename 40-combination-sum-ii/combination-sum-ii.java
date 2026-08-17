class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        Backtrack(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
    void Backtrack(int[] nums,int target,int start , List<Integer> list,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>target)
                break;

            list.add(nums[i]);
            Backtrack(nums,target-nums[i],i+1,list,ans);
            list.remove(list.size()-1);
        }
    }
}