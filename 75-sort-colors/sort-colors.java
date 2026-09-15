class Solution {
    public void sortColors(int[] nums) {
        int len=nums.length,temp;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
}