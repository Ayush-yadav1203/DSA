class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr =new int[1001];
        for(int[] t:trips){
            arr[t[1]]+=t[0];
            arr[t[2]]-=t[0];
        }
        int curr=0;
        for(int i=0;i<1001;i++){
            curr+=arr[i];
            if(curr>capacity) return false;
        }
        return true;
    }
}