class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String temp = "";
        for(int i=0;i<s.length();i++)
        {
         if(s.charAt(i) ==' ')
         {
            ans = temp+ans;
            temp = "";
            ans =' '+ans;
            
         }
         else{
            temp = temp+s.charAt(i);
         }
        }
        ans = temp+ans;
        String res = ans.replaceAll("\\s+"," ");
        return res.trim();
    }
}