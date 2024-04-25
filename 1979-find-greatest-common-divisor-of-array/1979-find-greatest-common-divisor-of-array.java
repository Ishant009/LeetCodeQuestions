class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0], nums[nums.length-1]);
    }
    int gcd(int a, int b){
        return b==0? a: gcd(b, a%b);
    }
}