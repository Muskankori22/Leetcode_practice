class Solution {
    public String removeStars(String s) {
      Stack<Character> st = new Stack<>();
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)!='*')
        {
            st.push(s.charAt(i));
        }
        else{
                if(!st.isEmpty())
            {
                st.pop();
            }
            }
      } 
      String ans = "";
      while(!st.isEmpty())
      {
        ans = st.pop()+ans;
      } 
      return ans;
    }
}