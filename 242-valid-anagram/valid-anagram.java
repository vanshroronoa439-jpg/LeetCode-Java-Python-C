class Solution {
    public boolean isAnagram(String s, String t) {
        int len1=s.length(),len2=t.length();
        if(len1!=len2){
            return false;
        }
        int[] ch=new int[26];
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<len1;i++){
           ch[s.charAt(i)-97]++;
           ch[t.charAt(i)-97]--;
        }
        for(int c:ch)if(c!=0)return false;
        return true;
    }
}