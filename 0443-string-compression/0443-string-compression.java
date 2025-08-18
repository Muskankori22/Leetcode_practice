class Solution {
    public int compress(char[] chars) {
     
       int idx = 0;
       if(chars.length==1)
       {
        return 1;
       }
       for(int i=0;i<chars.length;i++)
       {
        int count=0;
        char c = chars[i];
        while(i<chars.length && chars[i]==c)
        {
            count++;
            i++;
        }
        if(count==1)
        {
            chars[idx++]=c;
        }
        else{
            chars[idx++]=c;
            String str = Integer.toString(count);
               for (char s : str.toCharArray()) {
                   chars[idx++] = s;
               }
        }
        i--;
       }
     
      return idx; 
    }
}