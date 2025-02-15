class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr1 = new int[nums.length/2];
        int[] arr2 = new int[nums.length/2];
        int[] arr= new int[nums.length];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                arr1[j++]= nums[i];
            }else{
                arr2[k++]=nums[i];
            }
        }
        int l=0;
        for(int i=0;i<arr1.length;i++){
            arr[l++]= arr1[i];
            arr[l++]=arr2[i];
        }
        // System.out.println(Arrays.toString(arr));
        return arr;
    }
}