int reverse(int x){
    bool is_neg=false;
    long revnum=0,digit,num=x;
    if(num<0){
        is_neg=true;
        num *= -1;
    }
    while(num>0){
        digit=num%10;
        revnum= revnum*10 + digit;
        if((revnum*10<= pow(-2,31) || revnum*10 >=pow(2,31)-1) && num/10>0)
        {
            return 0;
        }
        num /=10;
    }
    if(is_neg==true){
        return revnum*-1;
    }
    return revnum;
}