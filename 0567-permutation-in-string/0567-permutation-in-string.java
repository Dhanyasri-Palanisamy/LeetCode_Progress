class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if(s1.length()>s2.length()){
             return false;
         }
         int s=s1.length();
         String se=sorti(s1);
         
         for(int i=0;i<=s2.length()-s;i++){
            String sub= s2.substring(i,i+s);
            if(se.equals(sub)|| se.equals(sorti(sub))){
                return true;
            }

         }
         return false;


    }
    public static String sorti(String s){
        char st[]= s.toCharArray();
        Arrays.sort(st);
        return new String(st);
    
    }


}