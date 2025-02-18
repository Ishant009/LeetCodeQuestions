class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        if(n!=t.length()) return false;
        // String sl = s.toLowerCase();
        // String tl = t.toLowerCase();
        int[] arr = new int[200];
        int[] arr2 = new int[200];
        for(int i=0;i<n;i++){
            if(arr[s.charAt(i)]!=arr2[t.charAt(i)]) return false;
            arr[s.charAt(i)]=i+1;
            arr2[t.charAt(i)]=i+1;
        }
        // Arrays.sort(arr);
        // Arrays.sort(arr2);
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=arr2[i]) return false;
        // }
        return true;
    }
}