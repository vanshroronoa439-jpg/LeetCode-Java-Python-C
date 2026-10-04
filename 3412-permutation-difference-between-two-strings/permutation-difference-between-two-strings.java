class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] a=new int[27];
        int[] b=new int[27];
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i),c2=t.charAt(i);
            a[c1-97]+=i;
            b[c2-97]+=i;
        }
        for(int i=0;i<27;i++){
            sum+= Math.abs(a[i]-b[i]);
        }
        return sum;
    }
}