class Solution {
    public int majorityElement(int[] nums) {
        int max= Integer.MIN_VALUE;
        int number = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>max){
                number = nums[i];
                max = map.get(nums[i]);
                
            }
        }
        return number;
    }
}