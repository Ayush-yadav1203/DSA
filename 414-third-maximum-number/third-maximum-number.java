class Solution {
    public int thirdMax(int[] nums) {
        // Set<Integer> set = new HashSet<>();

        // for (int x : nums)
        //     set.add(x);

        // Integer[] arr = set.toArray(new Integer[0]);

        // java.util.Arrays.sort(arr);

        // int n = arr.length;

        // return n >= 3 ? arr[n - 3] : arr[n - 1];
        Arrays.sort(nums);
        int n=nums.length;
        int count=1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]!=nums[i+1])
                count++;
            if(count==3){
                return nums[i];
            }
        }
        return nums[n-1];
    }
}