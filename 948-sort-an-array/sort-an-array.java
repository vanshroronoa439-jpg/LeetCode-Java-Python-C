class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    void mergeSort(int[] nums,int low ,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }
    static void merge(int[] nums,int low, int mid ,int high){
        int size= high-low+1;
        int[] temp=new int[size];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }
            else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=high){
            temp[k++]=nums[j++];
        }
        for(i=0;i<size;i++){
            nums[low+i]=temp[i];
        }
    }
}