class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> a = new ArrayList<>();

        // remove duplicates
        for (int x : nums)
            if (a.isEmpty() || a.get(a.size()-1) != x)
                a.add(x);

        int count = 0;

        // check hill / valley
        for (int i = 1; i < a.size() - 1; i++) {
            if ((a.get(i) > a.get(i-1) && a.get(i) > a.get(i+1)) ||
                (a.get(i) < a.get(i-1) && a.get(i) < a.get(i+1)))
                count++;
        }

        return count;
    }
}