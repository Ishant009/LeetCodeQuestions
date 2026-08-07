class Solution {
    public int removeDuplicates(int[] nums) {

        int a = nums[0];
        int l = 0;
        for(int i=1;i<nums.length;i++){
            System.out.println(nums[l] +"    "+nums[i]);
            if(nums[l]==nums[i]){
                continue;
            }
            nums[++l]=nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return l+1;
        
    }
}