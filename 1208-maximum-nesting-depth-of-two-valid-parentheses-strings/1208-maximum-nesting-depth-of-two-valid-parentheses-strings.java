class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] res = new int[n];
        int dep = 0;
        for(int i=0;i<n;i++)
        {
            if(seq.charAt(i)=='(')
            {
              dep++;
              res[i]=dep%2;
            }
            else{
                res[i]=dep%2;
                dep--;
            }
        }
     return res;
    }
}