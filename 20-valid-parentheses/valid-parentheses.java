class Solution {
    public boolean isValid(String s) {
        int len=s.length(),top=-1,check=1;
        char[] ch=new char[len];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                top++;
                ch[top]=c;
            }
            else if(c==')'||c=='}'||c==']'){
                if(top==-1){
                    return false;
                }
                if(ch[top]=='('){
                    check=1;
                }
                else{
                    check=2;
                }
                if(ch[top]==c-check){
                    top--;
                }
                else{
                    return false;
                }
            }
        }
        if(top!=-1){
            return false;
        }
        return true;
    }
}