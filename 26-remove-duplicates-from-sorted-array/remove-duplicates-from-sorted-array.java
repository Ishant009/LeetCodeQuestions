class Solution {
    public int removeDuplicates(int[] nums) {

        int a = nums[0];
        int l = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[l]==nums[i]){
                continue;
            }
            nums[++l]=nums[i];
        }
        return l+1;
        
    }
}