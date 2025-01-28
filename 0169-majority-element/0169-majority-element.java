class Solution {
    public int majorityElement(int[] nums) {
        int max= Integer.MIN_VALUE;
        int number = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
            if(map.get(nums[i])>max){
                number = nums[i];
                max = map.get(nums[i]);
                
            }
        }
        return number;
    }
}