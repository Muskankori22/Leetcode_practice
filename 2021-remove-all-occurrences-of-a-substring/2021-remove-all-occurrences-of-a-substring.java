class Solution {
    public String removeOccurrences(String s, String part) {
       StringBuilder stack = new StringBuilder();
       int m = part.length();
       for(char c:s.toCharArray())
       {
        stack.append(c);
        if(stack.length()>=m  && stack.substring(stack.length()-m).equals(part))
        {
          stack.delete(stack.length()-m,stack.length());
        }
       }
       return stack.toString();
    }
}