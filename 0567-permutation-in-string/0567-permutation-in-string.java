class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s2.length()< s1.length()) return false;
        int h=s1.length();
        int k= s1.length();
        int[] arr = new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
        }
        for(h=0; h<k;h++){
            arr[s2.charAt(h)-'a']--;
        }
        if(checkPermuation(arr,s1)) return true;
        int count =0;
        int l=0;
        while(h<s2.length()){
            arr[s2.charAt(h)-'a']--;
            arr[s2.charAt(l)-'a']++;
            boolean check = checkPermuation(arr,s1);
            if(check == true) {
                return true;
            }
            l++;
            h++;
        }
        return false;

    }

    public boolean checkPermuation(int[] arr, String s1){
        for(int i=0; i<s1.length();i++){
            if(arr[s1.charAt(i)-'a']!=0) return false;
        }
        return true;
    }
}