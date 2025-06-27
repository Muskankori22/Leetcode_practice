class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Queue<Integer> qu = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            qu.offer(i);
        }
        int[]result = new int[n];
        for(int i:deck)
        {
            int index = qu.poll();
            result[index] = i;
            if(!qu.isEmpty())
            {
                qu.offer(qu.poll());
            }
        }
      return result;
    }
}