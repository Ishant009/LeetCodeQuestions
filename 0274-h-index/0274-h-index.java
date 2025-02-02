class Solution {
    public int hIndex(int[] citations) {
       Arrays.sort(citations);
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