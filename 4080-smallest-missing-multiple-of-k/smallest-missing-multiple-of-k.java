class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> seen=new HashSet<>();
        int j=1,mul=0;
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            seen.add(nums[i]);
        }
        do{
            mul = k * j;
            j++;
            found=seen.contains(mul);
        }while(found);
        return mul;
    }
}