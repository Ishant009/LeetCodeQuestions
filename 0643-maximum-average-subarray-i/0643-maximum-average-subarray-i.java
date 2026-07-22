class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg =0;
        double maxAvg = Float.MIN_VALUE;
        int sum =0;
        int j= 0;
        while(j<k){
            sum += nums[j];
            j++;
        }
        maxAvg = ((double)sum)/k;
        // System.out.println(sum +"   "+k+"   "+avg);
        if(nums.length==k) return maxAvg;
        int l=0;
        for(int i=k;i<nums.length;i++){
            sum = sum+nums[i]-nums[l];
            l++;
            avg = ((double)sum)/k;
            if(avg>maxAvg){
                maxAvg = avg;
            }
        }
        return maxAvg;
    }
}