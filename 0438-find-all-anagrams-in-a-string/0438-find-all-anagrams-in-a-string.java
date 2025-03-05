class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        char arr1[] = p.toCharArray();
        Arrays.sort(arr1);
        String str1 = new String(arr1);
        int ln = p.length();
        for(int i=0;i<=s.length()-ln;i++)
        {
            char temp[] = new char[ln];
            int count = 0;
            for(int j=i;j<i+ln;j++)
            {
              temp[count]=s.charAt(j);
              count++;
            }
            Arrays.sort(temp);
            String str2 = new String(temp);
            if(str1.equals(str2))
            {
             ans.add(i);
            }
        }
        return ans;
    }
}