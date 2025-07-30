class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows==0)
        {
            return result;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        result.add(temp);
        if(numRows==1)
        {
            return result;
        }
        for(int i=1;i<numRows;i++)
        {
            List<Integer> prev = result.get(i-1);
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(1);
            for(int j=0;j<i-1;j++)
            {
                ans.add(prev.get(j)+prev.get(j+1));
            }
             ans.add(1);
             result.add(ans);
        }
        return result;
    }
}