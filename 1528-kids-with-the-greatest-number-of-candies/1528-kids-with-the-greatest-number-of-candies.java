class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ab = new ArrayList<>();
        int max = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]> max){
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                ab.add(true);
            }else{
                ab.add(false);
            }
        }
        return ab;
    }
}