class Solution {
    public String convert(String s, int numRows) {
        String arr[]= new String[numRows];
        if(numRows == 1 || numRows >= s.length())
    return s;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<numRows;i++){
            arr[i]="";
        }
        int cs=0;
        boolean up=false;
        for(int i=0;i<s.length();i++){
            arr[cs]+= ""+s.charAt(i);

            if(cs== 0|| cs+1==numRows){
               up=!up;
            }

            cs+=up?1:-1;
        }
        for(int i=0;i<numRows;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}