class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         HashMap<Integer, Integer> hm= new HashMap<>();
         hm.put(0,1);
         int prefsum=0;
         int count=0;
         for(int num :nums){
            prefsum+= num;
             if(hm.containsKey(prefsum-goal)){
                count+= hm.get(prefsum-goal);
             }
             hm.put(prefsum, hm.getOrDefault(prefsum,0)+1);
         }
       return count; 
    }
}