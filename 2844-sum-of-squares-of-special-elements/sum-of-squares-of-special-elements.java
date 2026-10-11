class Solution {
    public int sumOfSquares(int[] nums) {
        int len=nums.length,sum=0;
        for(int i=0;i<len;i++){
            if(len%(i+1)==0){
                sum+=(nums[i]*nums[i]);
            }
        }
        return sum;
    }
}