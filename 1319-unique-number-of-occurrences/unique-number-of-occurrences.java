class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            int val=map.get(key);
            map2.put(val,map2.getOrDefault(val,0)+1);
        }
        for(int key:map2.keySet()){
            int val=map2.get(key);
            if(val>1){
                return false;
            }
        }
        return true;
    }
}