class Solution {
    public int maximumWidth(int[] planks) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : planks) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        HashMap<Integer, Integer> pairs = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        for (int i = 0; i < list.size(); i++) {

            int x = list.get(i);

            for (int j = i; j < list.size(); j++) {

                int y = list.get(j);
                int count;

                if (x == y) {
                    count = map.get(x) / 2;
                } else {
                    count = Math.min(map.get(x), map.get(y));
                }

                int sum = x + y;

                pairs.put(sum, pairs.getOrDefault(sum, 0) + count);
            }
        }

        int ans = 0;

        // Original planks
        for (int h : map.keySet()) {
            ans = Math.max(ans, map.get(h));
        }

        // Combined planks
        for (int h : pairs.keySet()) {

            int width = pairs.get(h);

            width += map.getOrDefault(h, 0);

            ans = Math.max(ans, width);
        }

        return ans;
    }
}