class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length-1;
        int index =-1;
        // System.out.println(Arrays.toString(nums));
        for(int i=n-1;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            // System.out.println(Arrays.toString(nums));
            reverse(nums, 0, n);
            return;
        }
        for(int i=n;i>=index;i--){
            if(nums[i]>nums[index]){
                int temp =nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        reverse(nums, index+1, n);
    }
    public void reverse(int[] nums, int j, int n){
        while(j<n){
            int temp =nums[n];
            nums[n] = nums[j];
            nums[j]= temp;
            j++;n--;
        }
    }
}