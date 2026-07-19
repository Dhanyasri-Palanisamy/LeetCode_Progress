class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int d=0;
        int index=-1;
        int min=Integer.MAX_VALUE;
      for(int i=0;i<points.length;i++){
            int X= Math.abs(x - points[i][0]);
            int Y= Math.abs( y- points[i][1]);
            if(X==0 || Y==0){

                d= X+Y;
                if(min>d){
                    min=d;
                    index=i;
                }
            }
            
      }
      return index;  
    }
}