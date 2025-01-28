class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int counter =1;
        for(int i=1; i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
               nums[k++]= nums[i]; 
               counter=1;
            }else if(nums[i]==nums[i-1] && counter<2){
                nums[k++]=nums[i];
                counter++;
            }else{
                counter++;
            }
        }
        return k;
    }
}