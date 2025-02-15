class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int j=0;
        int k=1;
        int i=0;
        while(i<nums.length){
            if(nums[i]>=0){
                arr[j]=nums[i];
                j+=2;
            }else{
                arr[k]=nums[i];
                k+=2;
            }
            i++;
        }
        return arr;
    }
}