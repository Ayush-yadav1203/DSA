class Solution {
    public boolean hasAlternatingBits(int n) {
        String t=Integer.toBinaryString(n);
        boolean ok=true;
        for(int i=0;i<t.length()-1;i++){
            if(t.charAt(i)==t.charAt(i+1)){
                ok=false;
                break;
            }
        }
        return ok;
    }
}