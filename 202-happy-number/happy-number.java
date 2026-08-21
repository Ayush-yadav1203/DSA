class Solution {
    public boolean isHappy(int n) {
        // while (n != 1 && n != 4) {
        //     int sum = 0;

        //     while (n > 0) {
        //         int d = n % 10;
        //         sum += d * d;
        //         n /= 10;
        //     }

        //     n = sum;
        // }

        // return n == 1;
        int slow=n;
        int fast=n;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }
    public int findSquare(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=rem*rem;
            num=num/10;
        }
        return ans;
    }
}