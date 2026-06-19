class Solution {
    public int largestAltitude(int[] gain) {
        // int n=gain.length;
        // int[] res=new int[n+1];
        // res[0]=0;
        // int max=0;
        // for(int i=1;i<n+1;i++){
        //     res[i]=res[i-1]+gain[i-1];
        //     max=Math.max(max,res[i]);
        // }
        // return max;
        int cur=0,max=0;
        for(int g:gain){
            cur+=g;
            max=Math.max(max,cur);
        }
        return max;
    }
}