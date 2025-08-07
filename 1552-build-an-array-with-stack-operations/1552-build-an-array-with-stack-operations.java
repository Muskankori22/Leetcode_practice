
class Solution 
{
    public static List<String> findOperation(int[] target , int n)
    {
        int len = target.length;
        int idx = 0;
        List<String> results = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(idx == len)break;
            if(i == target[idx]){
                results.add("Push");
                idx++;
            }else {
                results.add("Push");
                results.add("Pop");
            }
        }

        return results;
    }

    public List<String> buildArray(int[] target, int n) {
        return findOperation(target,n);
    }
}