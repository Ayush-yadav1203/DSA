class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // int i=0;
        // while(i < nums.length){
        //     int correct = nums[i] - 1;

        //     if(nums[i] != nums[correct]){
        //         int temp = nums[i];
        //         nums[i] = nums[correct];
        //         nums[correct] = temp;
        //     } else {
        //         i++;
        //     }
        // }

        // List<Integer> ans = new ArrayList<>();

        // for(i = 1; i <= nums.length; i++){
        //     if(nums[i-1] != i ){
        //         ans.add(i);
        //     }
        // }

        // return ans;

        // HashSet<Integer> set=new HashSet<>();
        // for(int num:nums) 
        //     set.add(num);
        // List<Integer> list=new ArrayList<>();
        // for(int i=1;i<=nums.length;i++){
        //     if(!set.contains(i))
        //         list.add(i);
        // }
        // return list;

        List<Integer> ans = new ArrayList<>();

        // Mark visited numbers
        for (int num : nums) {
            int idx = Math.abs(num) - 1;
            nums[idx] = -Math.abs(nums[idx]);
        }

        // Positive values indicate missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;

    }
}