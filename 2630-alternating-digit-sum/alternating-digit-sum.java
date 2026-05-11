class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int ans=0;
        for(int i=0;i<s.length();i++){
            int dig=s.charAt(i)-'0';
            if(i%2==0) 
                ans+=dig;
            else 
                ans-=dig;
        }
        return ans;
    }
}