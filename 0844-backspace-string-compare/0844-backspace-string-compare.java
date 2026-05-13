class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='#'){
             if(!st.isEmpty()){
            st.pop();
            }
        }
        else{
            st.push(s.charAt(i));
        }
       }
       Stack<Character> ste = new Stack<>();
        for(int i=0;i<t.length();i++){
        if(t.charAt(i)=='#'){
            if(!ste.isEmpty()){
            ste.pop();
            }
        }
        else{
            ste.push(t.charAt(i));
        }
       }
       while(!st.isEmpty()&&!ste.isEmpty()){
           if(st.pop()!=ste.pop()){
               return false;
           }
       }
       return  st.isEmpty()&& ste.isEmpty();
       
    }
}