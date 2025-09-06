class Solution {
    public int maxDepth(String s) {
        int maxdep = 0;
        int currdep = 0;
        for(char ch : s.toCharArray())
        {
            if(ch=='(')
            {
                currdep++;
              maxdep = Math.max(maxdep,currdep);
            }
            else if(ch==')'){
                currdep--;
            }
        }
        return maxdep;
    }
}