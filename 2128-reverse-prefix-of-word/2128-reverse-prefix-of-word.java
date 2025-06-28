class Solution {
    public String reversePrefix(String word, char ch) {
        String ans = "";
        Stack<Character> st = new Stack<>();
        int ind = 0;
        for(int i=0;i<word.length();i++)
        {
         if(word.charAt(i)==ch)
         {
            ind = i;
            break;
         }
        }
        if(ind == 0)
        {
            return word;
        }
        for(int i=0;i<=ind;i++)
        {
           st.push(word.charAt(i)); 
        }
        while(!st.isEmpty())
        {
            ans = ans+st.pop();
        }
        for(int j=ind+1;j<word.length();j++)
        {
            ans = ans+word.charAt(j);
        }
       return ans;
    }
}