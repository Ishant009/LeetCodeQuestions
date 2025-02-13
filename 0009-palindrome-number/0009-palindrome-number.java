class Solution {
    public boolean isPalindrome(int x) {
        int res =0;
        int org = x;
        if(x<0) return false;
        while(x!=0){
            res = res*10+(x%10);
            x=x/10;
            // if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE) return 0;
        }
        return res==org;
    }
}