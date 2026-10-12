class Solution {
    public boolean rotateString(String s, String goal) {
        int len=s.length(),len2=goal.length(), index;
        if(len!=len2){
            return false;
        }
        s=s+s;
        for(int i=0;i<len;i++){
            if(s.substring(i,len2).equals(goal)){
                return true;
            }
            len2++;
        }
        return false;
    }
}