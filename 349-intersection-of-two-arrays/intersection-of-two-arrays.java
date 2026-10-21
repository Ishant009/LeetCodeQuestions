class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0; int j=0; int k =0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums = new int[n1+n2];
        while(i<n1 && j<n2){
            if(k!=0 && (nums[k-1]== nums1[i])){
                i++;
                continue;
            }
            if(k!=0 && (nums[k-1]== nums2[j])){
                j++;
                continue;
            }
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]==nums2[j]){
                nums[k++]= nums1[i++];
                j++;
            }else{
                j++;
            }
        }
        return Arrays.copyOfRange(nums,0, k);
    }
}