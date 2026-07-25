class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int[] arr = new int[2];
        int l=0;
        int h=0;
        int maxlen =0;
        for(h=0;h<nums.length;h++){
            arr[nums[h]]++;
            
            // int diff = findDifference(arr, k);
            while(arr[0]>k){
                arr[nums[l]]--;
                l++;
            }
            if(arr[0]==k || arr[0]<k){
                maxlen = Math.max(maxlen, arr[1]+arr[0]);
            }
            //  System.out.println(Arrays.toString(arr));
        }
       
        return maxlen;
    }

}