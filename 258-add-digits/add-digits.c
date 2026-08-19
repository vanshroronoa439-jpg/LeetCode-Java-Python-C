int addDigits(int num) {
    int digit=0,sum=0;
    while(num>9){
        while(num>0){
            digit=num%10;
            num /=10;
            sum +=digit;
        }
        num=sum;
        sum=0;
    }
    return num;
}