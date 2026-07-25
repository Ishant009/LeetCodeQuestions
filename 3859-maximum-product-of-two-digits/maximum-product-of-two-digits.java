class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n = n/10;
        }
        // System.out.println(list);
        Collections.sort(list);
        Collections.reverse(list);
        // System.out.println(list);
        return list.get(0)*list.get(1);
        
    }
}