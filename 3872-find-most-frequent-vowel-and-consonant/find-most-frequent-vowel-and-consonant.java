class Solution {
    public int maxFreqSum(String s) {
        int[] ch=new int[26];
        int maxv=0,maxc=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            ch[c-97]++;
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
                if(ch[c-97]>maxv){
                    maxv=ch[c-97];
                }
            }
            else{
                if(ch[c-97]>maxc){
                    maxc=ch[c-97];
                }
            }
        }
        return maxc+maxv ;
    }
}