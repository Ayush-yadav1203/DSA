class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Set<Integer> set = new HashSet<>();
        // Set<Integer> ans = new HashSet<>();

        // for (int x : nums1) set.add(x);

        // for (int x : nums2) {
        //     if (set.contains(x)) ans.add(x);
        // }

        // int[] res = new int[ans.size()];
        // int i = 0;
        // for (int x : ans) res[i++] = x;

        // return res;
        List<Integer> ans = new ArrayList<>();

        int n = nums1.length;
        int m = nums2.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!ans.contains(nums1[i])) {
                        ans.add(nums1[i]);
                    }
                }
            }
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}