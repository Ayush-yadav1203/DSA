class Solution {
    public int mirrorDistance(int n) {
        int sum=0;
        int temp=n;
        if(n==0) return 0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        int ans=Math.abs(temp-sum);
        return ans;
    }
}