class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=1,val,mul=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        do{
            mul = k * j;
            val=map.getOrDefault(mul,0);
            j++;
        }while(val!=0);
        return mul;
    }
}