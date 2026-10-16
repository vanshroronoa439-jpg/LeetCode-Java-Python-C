class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }
    void quickSort(int[] nums,int start, int end){
        if(end<=start)return;
        int pivot= part(nums,start,end);
        quickSort(nums,start,pivot-1);
        quickSort(nums,pivot+1,end);
    }
    int part(int[] nums,int start, int end){
        int pivot=nums[end];
        int i=start-1;
        for(int j=start;j<=end;j++){
            if(nums[j]<pivot){
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        i++;
        int temp=nums[i];
        nums[i]=nums[end];
        nums[end]=temp;
        return i;
    }
    
}