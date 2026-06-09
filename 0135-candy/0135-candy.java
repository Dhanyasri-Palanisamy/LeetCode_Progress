class Solution {
    public int candy(int[] ratings) {
       int right[]=new int[ratings.length];
       int left[]= new int[ratings.length];
       int n=ratings.length;
       right[n-1]=1;
       left[0]=1;
       for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                left[i]=left[i-1]+1;
            }
            else{
                left[i]=1;
            }
       }
       for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                right[i]=right[i+1]+1;
            }
            else{
                right[i]=1;
            }
       }
       int sum=0;
       for(int i=0;i<n;i++){
        sum+=Math.max(right[i],left[i]);
       }
       return sum;
    }
}