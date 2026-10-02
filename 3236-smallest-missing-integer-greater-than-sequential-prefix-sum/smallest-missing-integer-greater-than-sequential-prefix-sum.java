class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int sum=nums[0];
        for(int n:nums){
            set.add(n);
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else{
                break;
            }
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}