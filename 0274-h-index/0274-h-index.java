class Solution {
    public int hIndex(int[] citations) {
        int hmax=0;
        // Arrays.sort(citations, Collections.reverseOrder());
       Arrays.sort(citations);
        System.out.println(Arrays.toString(citations));
        int j=1;
        int k=0;

        for(int i=citations.length-1;i>=0;i--){
            if(j > citations[i]){
                return k;
            }
            j++;
            k++;
        }
        return k;
    }
}