class Solution {
    public boolean checkDivisibility(int n) {
        int digit,dsum=0,dpro=1,num=n;
        while(n>0){
            digit=n%10;
            n/=10;
            dsum += digit;
            dpro *= digit;
        }
        return(num%(dsum+dpro)==0);
    }
}