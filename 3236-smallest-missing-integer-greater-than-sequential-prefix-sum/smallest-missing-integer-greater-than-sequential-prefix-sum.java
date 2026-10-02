class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int num=nums[0],sum=0;
        for(int n:nums){
            if(!set.contains(n)){
                set.add(n);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(num!=nums[i]){
                break;
            }
            sum+=nums[i];
            num++;
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}