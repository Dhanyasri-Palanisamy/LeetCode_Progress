class Solution {
    public String countAndSay(int n) {
        String s="1";
        int count=1;
        for(int i=1;i<n;i++){
            s= cout(s);


        }
        return s;
    } 
    public static String cout(String s){
         int count=1;
         StringBuilder str= new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
              
               str.append(count);
                str.append(s.charAt(i-1));
                count=1;
            }
           
        }
        str.append(count);
        str.append(s.charAt(s.length()-1));
        return str.toString();
    }
}