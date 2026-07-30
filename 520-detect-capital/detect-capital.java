class Solution {
    public boolean detectCapitalUse(String word) {
        
        String str = "abcdefghijklmnopqrstuvwxyz";
        String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        char c = word.charAt(0);
        if(word.length()<=1) return true;
        
        if(str.indexOf(c)==-1){
            //first capital letter
            // System.out.println(c);
            if(word.length()==2) return true;
            char d = word.charAt(1);
            if(str.indexOf(d)==-1){
                // System.out.println(d);
                for(int i=2;i< word.length();i++){
                    System.out.println(word.charAt(i));
                    if(str1.indexOf(word.charAt(i))==-1){
                        // System.out.println(str1.indexOf(word.charAt(i)));
                        return false;
                    }
                }
            }else
            {
                for(int i=2;i<word.length();i++){
                    if(str.indexOf(word.charAt(i))==-1) return false;
                }
            }

        }else{

            for(int i=1; i<word.length();i++){
                if(str.indexOf(word.charAt(i))==-1){
                    return false;
                }
            }

        }


        return true;
    }
}