class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        StringBuilder st=new StringBuilder(sb.substring(0,k));
        st=st.reverse();
        sb.delete(0,k);
        sb.insert(0,st);
        return sb.toString();
    }
}