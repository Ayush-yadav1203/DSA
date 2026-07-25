class Solution {
    public int maxProduct(int n) {
        int mul=0;
        int mup=0;
        while(n>0){
            int dig=n%10;
            if(dig>=mul){
                mup=mul;
                mul=dig;
            }else if(dig>mup){
                mup=dig;
            }
            n/=10;
        }
        return mul*mup;
    }
}