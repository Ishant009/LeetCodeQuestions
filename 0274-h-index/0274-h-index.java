class Solution {
    public int hIndex(int[] citations) {
        int hmax=0;
        // Arrays.sort(citations, Collections.reverseOrder());
       Arrays.sort(citations);
        System.out.println(Arrays.toString(citations));
        int j=1;
        int k=0;
        if(citations.length==1 && citations[0]>=1){
            return 1;
        }
        for(int i=citations.length-1;i>=0;i--){
            if(j > citations[i]){
                return k;
            }
            j++;
            k++;
        }
        return k;
        // System.out.println(hmax);
        // int k=0;
        // for(int i=0;i<citations.length;i++){
        //     if(hmax<=citations[i]){
        //         k++;
        //     }
        // }
        // return k;
    }
}