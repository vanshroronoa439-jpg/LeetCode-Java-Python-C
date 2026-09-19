class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> seen1=new HashSet<>();
        HashSet<Integer> seen2=new HashSet<>();
        for(int n: nums1){
            seen1.add(n);
        }
        for(int n: nums2){
            seen2.add(n);
        }
        int len=0;
        for(int x: seen1){
            if(seen2.contains(x)){
                len++;
            }
        }
        int[] result=new int[len];
        int i=0;
        for(int x: seen1){
            if(seen2.contains(x)){
                result[i++]=x;
            }
        }
        return result;
    }
}