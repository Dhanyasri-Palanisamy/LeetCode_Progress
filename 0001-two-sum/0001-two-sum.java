class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n;
        int i=0;
        for(i=0;i<nums.length;i++){
             
             n= target-nums[i];
             if(hm.containsKey(n)){
                return new int[]{hm.get(n),i};
             }
             hm.put(nums[i], i);
        
            }
             return new int[]{0,0};
    }
   
}