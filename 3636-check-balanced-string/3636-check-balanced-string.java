class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;
        char []ans = num.toCharArray();
        for(int i=0;i<ans.length;i++)
        {
            if(i%2==0)
            {
                int sum = ans[i] - '0';
                evenSum = evenSum + sum;
            }
            else{
                int sum = ans[i] - '0';
                oddSum = oddSum + sum;
            }
        }
        if(oddSum==evenSum)
        {
            return true;
        }
        return false;
    }
}