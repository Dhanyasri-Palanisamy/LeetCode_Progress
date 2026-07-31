class Solution {
    public boolean judgeCircle(String moves) {
        int updown=0;
        int lr=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                updown++;
            }
            else if(moves.charAt(i)=='D'){
                updown--;
            }
            else if(moves.charAt(i)=='L'){
                lr++;
            }
            else if(moves.charAt(i)=='R'){
               lr--;
            }

        }
        if( lr==0 && updown ==0){
            return true;
        }
        return false;
    }
}