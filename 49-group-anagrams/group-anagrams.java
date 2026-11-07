    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> list=new ArrayList<>();
            HashSet<String> set=new HashSet<>();
            for(int i=0;i<strs.length;i++){
                if(set.contains(strs[i]))continue;
                List<String> cg = new ArrayList<>();
                list.add(cg);
                cg.add(strs[i]);
                set.add(strs[i]);
                for(int j=i+1;j<strs.length;j++){
                    boolean match=true;
                    if(strs[i].length()!=strs[j].length())continue;
                    int len=strs[i].length();
                    int[] ch=new int[26];
                    for(int k=0;k<len;k++){
                        ch[strs[i].charAt(k)-97]++;
                        ch[strs[j].charAt(k)-97]--;
                    }
                    for(int c: ch){
                        if(c!=0)match=false;
                    }
                    if(!match)continue;
                    cg.add(strs[j]);
                    set.add(strs[j]);
                }
            }
            return list;
        }
    }