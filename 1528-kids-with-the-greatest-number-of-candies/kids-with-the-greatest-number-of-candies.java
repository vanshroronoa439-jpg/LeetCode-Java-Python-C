class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len=candies.length;
        ArrayList<Boolean> result=new ArrayList<>();
        int max=Integer.MIN_VALUE; 
        for(int i=0;i<len;i++){
            max=candies[i]>max?candies[i]:max;
        }
        for(int i=0;i<len;i++){
            if(candies[i]+extraCandies>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}