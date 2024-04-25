class Solution {
    public int findGCD(int[] nums) {
        int s= Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;
        for(int i: nums){
            if(i<s) s =i;
            if(i>l) l= i;
        }
        return gcd(s, l);
    }
    int gcd(int a, int b){
        return b==0? a: gcd(b, a%b);
    }
}