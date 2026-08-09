char findTheDifference(char* s, char* t) {
    int s_size= strlen(s);
    int sum=0;
    for(int i=0;i<s_size;i++){
        sum-= *s;
        s++;
        sum+= *t;
        t++;
    }
    sum+=*t;
    return sum;
}