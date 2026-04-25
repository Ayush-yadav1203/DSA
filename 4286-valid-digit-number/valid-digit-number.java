class Solution {
    public boolean validDigit(int n, int x) {
        String s=String.valueOf(n);
        char digit=(char)(x+'0');
        return (s.indexOf(digit)!=-1 && s.charAt(0)!=digit);
    }
}