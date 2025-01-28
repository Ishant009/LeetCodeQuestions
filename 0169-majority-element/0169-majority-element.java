class Solution {
    public int majorityElement(int[] nums) {
        int max= Integer.MIN_VALUE;
        int number = Integer.MIN_VALUE;
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            int count = map.get(nums[i]);
            if(count>max){
                number = nums[i];
                max = map.get(nums[i]);
                  if(count> len/2) return number;
            }
          
        }
        return number;
    }
}