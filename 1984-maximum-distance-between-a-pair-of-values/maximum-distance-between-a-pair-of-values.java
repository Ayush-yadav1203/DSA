class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        // int ans=0;
        // for(int i =0;i<nums1.length;i++){
        //     for(int j=i;j<nums2.length;j++){
        //         if(i<=j && nums1[i]<=nums2[j]){
        //             ans=Math.max(ans,j-i);
        //         }
        //     }
        // }
        // return ans; tle occurs .........
        int ans=0,i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                ans=Math.max(ans,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}