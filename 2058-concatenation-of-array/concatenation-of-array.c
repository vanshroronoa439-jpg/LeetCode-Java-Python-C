/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* nums, int numsSize, int* returnSize) {
    *returnSize=(numsSize*2);
    int *result = malloc(numsSize*2*sizeof(int));
    int *ans=result;
    int n=numsSize;
    while(n>0){
        *ans = *nums;
        *(ans+numsSize)=*nums;
        nums++;
        ans++;
        n--;
    }
    return result;
}