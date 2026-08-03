class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        
        int l=0; 
        List<Integer> list = new ArrayList<>();
        if(s.length()<p.length()) return list;
        int[] arr = new int[26];
        int k=p.length();
        for(int i=0;i<k;i++){
            arr[p.charAt(i)-'a']++;
        }

        for(int i=0;i<k;i++){
            arr[s.charAt(i)-'a']--;
        }
        if(checkAnagrams(arr)){
            list.add(0);
        }
        System.out.println(Arrays.toString(arr));
        for(int h=k; h<s.length();h++){
            arr[s.charAt(h)-'a']--;
            arr[s.charAt(l)-'a']++;
            l++;
            // System.out.println(s.charAt(l)+ " "+s.charAt(h)+"   "+Arrays.toString(arr));
            if(checkAnagrams(arr)){
                list.add(l);
            }

        }
        
        // System.out.println(Arrays.toString(arr));
        return list;
    }

    public boolean checkAnagrams(int[] arr){
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}