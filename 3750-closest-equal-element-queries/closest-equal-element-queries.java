import java.util.*;

class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;

        // map value -> sorted indices
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> ans = new ArrayList<>();

        for (int q : queries) {
            int val = nums[q];
            List<Integer> list = map.get(val);

            if (list.size() == 1) {
                ans.add(-1);
                continue;
            }

            // binary search position
            int pos = Collections.binarySearch(list, q);

            int size = list.size();

            int leftIdx = list.get((pos - 1 + size) % size);
            int rightIdx = list.get((pos + 1) % size);

            int d1 = Math.abs(q - leftIdx);
            int d2 = Math.abs(q - rightIdx);

            d1 = Math.min(d1, n - d1);
            d2 = Math.min(d2, n - d2);

            ans.add(Math.min(d1, d2));
        }

        return ans;
    }
}