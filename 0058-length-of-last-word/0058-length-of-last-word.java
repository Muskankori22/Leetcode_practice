class Solution {
    public int lengthOfLastWord(String s) {
    int count = 0;
    int temp = 0;
    String tr = s.trim();
    char []arr = tr.toCharArray();
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]!=' ')
      {
        count++;
      }
      else
      {
        temp = count;
        count = 0;
      }
    }
    if(count!=0)
    {
        return count;
    }
    else{
      return temp;
    }
    }
}