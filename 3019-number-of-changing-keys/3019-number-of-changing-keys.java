class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int count=0;
        int l=0;
        int r=1;
        while(l<s.length() && r<s.length()){
            if(s.charAt(l)==s.charAt(r)){
                r++;
            }
            else{
                count++;
                l=r;
                r=l+1;
            }
        }
        return count;
    }
}