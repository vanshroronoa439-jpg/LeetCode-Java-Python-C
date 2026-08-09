int reverse(int x){
    long revnum=0,digit,num=x;
    while(num!=0){
        digit=num%10;
        revnum= revnum*10 + digit;
        if(revnum<INT_MIN || revnum > INT_MAX)
        {
            return 0;
        }
        num /=10;
    }
    return revnum;
}