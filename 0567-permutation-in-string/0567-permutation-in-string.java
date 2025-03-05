class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char arr1[] = s1.toCharArray();
        Arrays.sort(arr1);
        String str1 = new String(arr1);
        for(int i=0;i<=s2.length()-s1.length();i++)
        {
            char arr2[] = new char[s1.length()];
            int count = 0;
            for(int j=i;j<i+s1.length();j++)
            {
              arr2[count]= s2.charAt(j);
              count++;
            }
            Arrays.sort(arr2);
            String str2 = new String(arr2);
            if(str1.equals(str2))
            {
                return true;
            }
        }
        return false;
    }
}