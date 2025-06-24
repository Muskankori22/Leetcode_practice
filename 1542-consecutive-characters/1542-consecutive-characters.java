class Solution {
    public int maxPower(String s) {
        
        int max = 1;
        int temp = 1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                temp++;
            }
            else{
                max = Math.max(temp,max);
                temp=1;
            }
        }
        max = Math.max(temp,max);
        return max;
    }
}