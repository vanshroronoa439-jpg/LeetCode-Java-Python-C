class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int len=nums.length;
        int[] num=new int[len];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<len;i++){
            num[nums[i]-1]++;
        }
        for(int i=0;i<len;i++){
            if(num[i]==2){
                list.add(i+1);
            }
        }
        return list;
        
    }
}