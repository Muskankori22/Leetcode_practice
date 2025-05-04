class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        {
            return 0;
        }
      int start = 0;
      int end = 0;
      int n = s.length();
      HashSet<Character> st = new HashSet<>();
      int maxlen = Integer.MIN_VALUE;
      while(end < n)
      {
        char ch = s.charAt(end);
        if(st.contains(ch))
        {
            while(start<end && st.contains(ch))
            {
              st.remove(s.charAt(start));
              start++;
            }
        }
        st.add(ch);
        maxlen = Math.max(maxlen,end-start+1);
        end++;
      }
      return maxlen;
    }
}