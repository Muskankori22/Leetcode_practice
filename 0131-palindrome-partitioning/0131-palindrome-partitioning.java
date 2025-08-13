class Solution {
    public boolean isPallindrom(String s)
    {
        int st = 0;
        int e = s.length()-1;
        while(st<e)
        {
            if(s.charAt(st)==s.charAt(e))
            {
                st++;
                e--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public void getAllPartition(String s,List<String> partition,List<List<String>> ans)
    {
        if(s.length()==0)
        {
            ans.add(new ArrayList<>(partition));
            return;
        }
      for(int i=0;i<s.length();i++)
      {
        String part = s.substring(0,i+1);
        if(isPallindrom(part))
        {
           partition.add(part);
           getAllPartition(s.substring(i+1), partition,ans);
            partition.remove( partition.size()-1);
        }
      }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> partition = new ArrayList<>();
        getAllPartition(s, partition,ans);
        return ans;
    }
}