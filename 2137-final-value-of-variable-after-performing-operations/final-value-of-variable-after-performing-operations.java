class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            switch(s){
                case "--X":
                case "X--":{
                    x--;
                    break;
                }
                case "++X":
                case "X++":{
                    x++;
                }
            }
        }
        return x;
    }
}