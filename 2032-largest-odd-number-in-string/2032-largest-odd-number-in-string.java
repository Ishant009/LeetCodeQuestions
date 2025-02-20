class Solution {
    public String largestOddNumber(String num) {
            int j=0;
            int k=num.length();
            while(j<k){
            if(Integer.valueOf(num.charAt(k-1))%2!=0){
                return num.substring(j, k);
            }
                k--;
        }
        return "";
    }
}