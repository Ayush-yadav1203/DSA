class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp=new int[m+1][n+1];
        return count(m,n);
    }
    int count(int r,int c){
        if(r==1 || c==1) return 1;
        if(dp[r][c]!=0) 
            return dp[r][c];
        int left=count(r-1,c);
        int right=count(r,c-1);
        dp[r][c]=left+right;
        return dp[r][c];
    }

}