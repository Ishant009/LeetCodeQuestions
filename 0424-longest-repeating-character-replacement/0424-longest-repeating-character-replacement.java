class Solution {
    public int characterReplacement(String s, int k) {

        int l=0;
        int h=0;
        int[] arr = new int[26];
        int res = Integer.MIN_VALUE;
        for(h=0;h<s.length();h++){
            arr[s.charAt(h)-'A']++;
            int len = h-l+1;
            int maxCount = countMaxCharacter(arr);
            int diff= len-maxCount;
            while(diff>k){
                arr[s.charAt(l)-'A']--;
                l++;
                len = h-l+1;
                maxCount = countMaxCharacter(arr);
                diff= len-maxCount;
            }
            if(diff == k || diff<k){
                len = h-l+1;
                res = Math.max(res, len);
            }
        }
        return res;
    }

    public int countMaxCharacter(int[] arr){
        int count =0;
        int maxCount= Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                count = Math.max(arr[i], count);
            }
        }
        return count;
    }
}