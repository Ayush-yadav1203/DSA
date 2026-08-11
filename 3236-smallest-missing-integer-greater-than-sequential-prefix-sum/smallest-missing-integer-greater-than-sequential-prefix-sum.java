class Solution {
    public int missingInteger(int[] nums) {

        int sum = nums[0];
        int i = 1;

        while (i < nums.length && nums[i] - nums[i - 1] == 1) {
            sum += nums[i];
            i++;
        }

        boolean found = true;

        while (found) {
            found = false;

            for (int num : nums) {
                if (num == sum) {
                    sum++;
                    found = true;
                    break;
                }
            }
        }

        return sum;
    }
}