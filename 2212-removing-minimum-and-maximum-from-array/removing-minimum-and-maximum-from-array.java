class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minindex=0;
        int maxindex=0;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[minindex]){
                minindex=i;
            }
            if(nums[i]>nums[maxindex]){
                maxindex=i;
            }
        }
        if(minindex>maxindex){
            int temp=minindex;
            minindex=maxindex;
            maxindex=temp;
        }
        int left =maxindex+1;
        int right=n-minindex;
        int mid=(minindex+1)+(n-maxindex);
        return Math.min(left,Math.min(right,mid));

    }
}