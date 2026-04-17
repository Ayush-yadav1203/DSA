import java.util.*;

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i], rev = 0;

            while (x > 0) {
                rev = rev * 10 + x % 10;
                x /= 10;
            }

            // instead of checking rev in map,
            // check current number in map of reversed numbers
            if (map.containsKey(nums[i])) {
                ans = Math.min(ans, i - map.get(nums[i]));
            }

            map.put(rev, i); // store reverse
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}