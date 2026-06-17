class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i=0;
        int time=0;
       while(tickets[k]!=0){
          i=i%tickets.length;
          if(tickets[i]==0){
            i++;
            continue;
          }
           tickets[i]--;
           i++;
           time++;

       }
       return time;
        
    }
}