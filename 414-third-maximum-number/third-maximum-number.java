class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int x : nums)
            set.add(x);

        Integer[] arr = set.toArray(new Integer[0]);

        java.util.Arrays.sort(arr);

        int n = arr.length;

        return n >= 3 ? arr[n - 3] : arr[n - 1];
    }
}