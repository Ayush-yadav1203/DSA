class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, count = n;
        int[] grp = new int[n];
        for (int i = 0; i < n; i++) grp[i] = i;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (isConnected[i][j] == 1 && grp[i] != grp[j]) {
                    int old = grp[j];
                    for (int k = 0; k < n; k++)
                        if (grp[k] == old) grp[k] = grp[i];
                    count--;
                }

        return count;
    }
}