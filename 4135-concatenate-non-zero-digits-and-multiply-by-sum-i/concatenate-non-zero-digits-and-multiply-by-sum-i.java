class Solution {
    public long sumAndMultiply(int n) {
        int x=0 , sum =0,p=1;
        while(n>0){
            int d= n%10;
            if(d!=0){
                x+=d*p;
                sum+=d;
                p*=10;
            }
            n=n/10;
        }
        return 1L*x*sum;
        //1L = long data type
    }
}