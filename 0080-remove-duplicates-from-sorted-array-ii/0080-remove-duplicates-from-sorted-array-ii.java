class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])<2){
                    nums[k++]= nums[i];
                }
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}