class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s2.length()< s1.length()) return false;
        int h=s1.length();
        int k= s1.length();
        int[] arr = new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
        }
        // System.out.println(Arrays.toString(arr));
        
        for(h=0; h<k;h++){
            arr[s2.charAt(h)-'a']--;
        }
        // System.out.println(Arrays.toString(arr));
        if(checkPermuation(arr)) return true;
        int count =0;
        int l=0;
        while(h<s2.length()){
            // System.out.println(count + ":   "+Arrays.toString(arr));
            
            
            arr[s2.charAt(h)-'a']--;
            arr[s2.charAt(l)-'a']++;
            boolean check = checkPermuation(arr);
            if(check == true) {
                // System.out.println(true);
                return true;
            }
            l++;
            h++;
            // System.out.println(check);

        }
        return false;

    }

    public boolean checkPermuation(int[] arr){
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}