class Solution {
    public int lengthOfLastWord(String s) {
        String[]  arr = s.split(" ");
        int count = 0;
        String str = s.stripTrailing();
        int i = str.length()-1;
        while(i>=0 && str.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}