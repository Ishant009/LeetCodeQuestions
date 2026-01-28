class Solution {
    public int[] sortedSquares(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]<0){
                k++;
            }
            nums[i]=nums[i]*nums[i];
        }
        if(k==0) return nums;
        if(k==nums.length){
            int i=0, j=nums.length-1;
            while(i<j){
                nums[i]=nums[i]^nums[j];
                nums[j]=nums[i]^nums[j];
                nums[i]=nums[i]^nums[j];
                i++;j--;
            }
            return nums;
        }
        int[] arr = new int[nums.length];
        int l= k-1;
        int i=0;
        while(k<nums.length && l>=0){
            if(nums[k]<=nums[l]){
                arr[i]=nums[k];
                k++;
            }else{
                arr[i]=nums[l];
                l--;
            }
            // 
            i++;
            
        }
        while(k<=nums.length-1){
            arr[i++]=nums[k++];
        }
        while(l>=0){
            arr[i++]=nums[l--];
        }
        return arr;
    }
}