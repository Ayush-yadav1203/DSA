class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        
        for (int x : nums1) m.put(x, m.getOrDefault(x, 0) + 1);
        
        for (int x : nums2)
            if (m.getOrDefault(x, 0) > 0) {
                l.add(x);
                m.put(x, m.get(x) - 1);
            }
        
        return l.stream().mapToInt(i -> i).toArray();
    }
}