class StockSpanner {
   Stack<Integer>st;
   ArrayList<Integer>ls;
    public StockSpanner() {
        st = new Stack<>();
        ls = new ArrayList<>();
    }
    
    public int next(int price) {
        ls.add(price);
        while(!st.isEmpty() && ls.get(st.peek())<=price)
        {
            st.pop();
        }
        int prev = (st.isEmpty())?-1:st.peek();
        int curr = ls.size()-1;
        int ans = curr-prev;
        st.push(curr);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */