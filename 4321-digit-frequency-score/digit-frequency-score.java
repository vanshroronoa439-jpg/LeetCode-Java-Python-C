class Solution {
    public int digitFrequencyScore(int n) {
        int[] num=new int[10];
        int sum=0;
        while(n>0){
            num[n%10]++;
            n/=10;
        }
        for(int i=0;i<10;i++){
            sum+=i*num[i];
        }
        return sum;
    }
}