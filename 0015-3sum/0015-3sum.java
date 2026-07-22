class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n= arr.length;
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(arr);
        if(arr.length<3){
            return ans;
        }
        for(int i=0;i<n-2;i++){
             if (arr[i] > 0) break; 
            int left=i+1,right=n-1;
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            while(left<right){
            long sum= (long)arr[i]+arr[right]+arr[left];
            if(sum==0){
                List<Integer> temp= new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[left]);
                temp.add(arr[right]);

                ans.add(temp);
            
            while(left<right && arr[left]==arr[left+1]){
                left++;
            }
            while(left<right && arr[right]==arr[right-1]){
                right--;
            }
            left++;
            right--;
            }
            else if(sum<0){
                left++;
            }
            else {
                right--;
            }
            }
        }
        return ans;
    }
}