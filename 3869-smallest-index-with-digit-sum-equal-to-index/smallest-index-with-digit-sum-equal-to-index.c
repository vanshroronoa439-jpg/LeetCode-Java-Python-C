int smallestIndex(int* nums, int numsSize) {
    for(int i=0;i<numsSize;i++){
        int sum=0;
        int num=*nums;
        while(num>0){
            int digit=num%10;
            sum+= digit;
            num/=10;   
        }
        if(i==sum){
            return i;
        }
        nums++;
    }
    return -1;
}