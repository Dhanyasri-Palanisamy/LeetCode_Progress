class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int s=0;
        for(int i=0;i<operations.length;i++){
            String str= operations[i];
            if(str.equals("+")){
                int p= st.pop();
                int sum=p+st.peek();
                st.push(p);
                st.push(sum);
                s+=st.peek();
            }
            else if(str.equals("D")){
                int val= st.peek();
                st.push(2*val);
                s+=st.peek();
            }
            else if(str.equals("C")){
               int z= st.pop();
                s-=z;
            }
            else{
                int n=Integer.parseInt(str);
                st.push(n);
                s+=st.peek();
            }
        }
        
      return s;  
    }
}