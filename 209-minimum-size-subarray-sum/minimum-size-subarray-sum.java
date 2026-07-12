class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int l=0; int h=0;
        int sum=0;
        int count=0;
        int minCount=Integer.MAX_VALUE;
        while(h<nums.length){
            sum = sum + nums[h];
            count++;
            while(sum>= target){
                minCount= Math.min(count, minCount);
                sum = sum - nums[l];
                l++;
                count--;
            }
            h++;
        }
        return (minCount==Integer.MAX_VALUE)? 0: minCount;
    }
}