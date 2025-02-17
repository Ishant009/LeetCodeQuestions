class Solution {
    public String reverseWords(String s) {
        String[] srr= s.replaceAll("\\s+"," ").split(" ");
       StringBuilder sb = new StringBuilder();
       for(int i=srr.length-1; i>=0; i--){
            sb.append(srr[i]+" ");
       }
       return sb.toString().trim();
    }

  
}
