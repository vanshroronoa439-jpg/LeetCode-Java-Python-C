class Solution {
    public boolean isAnagram(String s, String t) {
        int len1=s.length(),len2=t.length();
        if(len1!=len2){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<len1;i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            map.put(c1,map.getOrDefault(c1,0)+1);
            map.put(c2,map.getOrDefault(c2,0)-1);
        }
        for(char key: map.keySet()){
            int val=map.get(key);
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}