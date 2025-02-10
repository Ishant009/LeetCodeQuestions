class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int Tsum = (n * (n + 1)) / 2;
        int sum1 = 0;
        for( int i:nums){
            sum1=sum1+i;
        }
        return Tsum - sum1;
    }
}