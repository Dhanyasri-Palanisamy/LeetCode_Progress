class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("C")){
                st.pop();
            }
            else if(ops[i].equals("D")){
               int num= st.peek();
               st.push(num*2);
            }
            else if(ops[i].equals("+")){
                int n1= st.pop();
                int n2= st.peek();
                int n3= n1+n2;
                st.push(n1);
                st.push(n3);
            }
            else{
                int n= Integer.parseInt(ops[i]);
                st.push(n);
            }
        }
        int num=0;
        while(!st.isEmpty()){
            num+=st.pop();
        }
        return num;
    }
}