

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){
    *returnSize = numsSize;
    int *arr= malloc(numsSize*sizeof(int));
    for(int i=0,j=0;j<n;i+=2,j++){
        arr[i]=nums[j];
        arr[i+1]=nums[n+j];
    }
    return arr;
}