class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int small = nums[0];
        int large = nums[nums.length-1];
        int gcd = gcd(small, large);
        return gcd;
        
    }
    int gcd(int a, int b){
        return b==0? a: gcd(b, a%b);
    }
}