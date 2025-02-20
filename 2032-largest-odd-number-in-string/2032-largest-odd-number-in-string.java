class Solution {
    public String largestOddNumber(String num) {
            int j=0;
            int k=num.length();
            while(j<k){
                // System.out.println(str+"   "+num.charAt(k-1));
                if(Integer.valueOf(num.charAt(k-1))%2!=0){
                String str = num.substring(j, k);
                    return str;
                }
                k--;
                // System.out.println("i:"+i+" j:"+j+"  k:"+k+"   "+str);
        
        }
        return "";
    }
}