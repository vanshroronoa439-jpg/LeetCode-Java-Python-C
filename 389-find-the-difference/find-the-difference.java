class Solution {
    public char findTheDifference(String s, String t) {
        int len1=s.length();
        int sum=0;
        for(int i=0;i<len1;i++){
            sum -=s.charAt(i);
            sum +=t.charAt(i);
        }
        sum+=t.charAt(len1);
        return (char)(sum);
    }
}