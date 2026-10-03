class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                if(allowed.indexOf(c)<0){
                    count--;
                    break;
                }
            }
            count++;
        }
        return count;
    }
}