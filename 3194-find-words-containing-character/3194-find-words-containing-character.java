class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String str = words[i];
            int ind = str.indexOf(x);
            if(ind != -1)
            {
                ls.add(i);
            }
        }
        return ls;
    }
}