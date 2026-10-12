class Solution {
    public boolean rotateString(String s, String goal) {
        int len1=s.length(),len2=goal.length(),count=0;
        StringBuilder sb=new StringBuilder(s);
        StringBuilder sb2=new StringBuilder(goal);
        if(len1!=len2){
            return false;
        }
        while(count<len1){
            char c=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            if(sb.compareTo(sb2)==0)return true;
            count++;
        }
        return false;
    }
}