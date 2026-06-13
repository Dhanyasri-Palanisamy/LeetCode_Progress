class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st= new Stack<>();
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int num:nums2){
            while(!st.isEmpty() && st.peek()<num){
                hm.put(st.pop(),num);
            }
            st.push(num);
        }
        int arr[]= new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
             arr[i]= hm.getOrDefault(nums1[i],-1);
        }
        return arr;
    }
}