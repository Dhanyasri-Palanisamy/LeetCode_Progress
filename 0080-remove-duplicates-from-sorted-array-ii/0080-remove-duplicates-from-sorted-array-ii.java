
class Solution {
    public int removeDuplicates(int[] arr) {
         if( arr.length<=2) return arr.length;
        int j=2;
       
       for(int i=2;i<arr.length;i++){
              if(arr[i]!=arr[j-2]){
                arr[j]=arr[i];
                j++;
                 
              }

       }
       return j;
    }
}