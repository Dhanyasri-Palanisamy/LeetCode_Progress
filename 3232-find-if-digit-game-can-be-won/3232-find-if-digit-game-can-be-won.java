class Solution {
    public boolean canAliceWin(int[] nums) {
        int s=0,d=0;
        for(int n: nums){
            if(n<=9){
              s+=n;
            }
            else {
                d+=n;
            }
        }
      if(s==d){
        return false;
      }
      return true;
    }
}