class Solution {
    public boolean isCircularSentence(String sentence) {
        char[] arr = sentence.toCharArray();
        Queue<String> qu = new LinkedList<>();
        String str = "";

        // Add all words to the queue
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                str = str + arr[i];
            } else {
                qu.offer(str);
                str = "";
            }
        }
        // Add the last word after the loop
        if (!str.isEmpty()) {
            qu.offer(str);
        }

        // Special case: only one word
        if (qu.size() == 1) {
            String word = qu.peek();
            return word.charAt(0) == word.charAt(word.length() - 1);
        }

        // Check circular condition between consecutive words
        String first = qu.peek(); // store first word
        String prev = qu.poll();

        while (!qu.isEmpty()) {
            String curr = qu.peek();
            if (prev.charAt(prev.length() - 1) != curr.charAt(0)) {
                return false;
            }
            prev = qu.poll();
        }

        // Finally, compare last and first words
        return prev.charAt(prev.length() - 1) == first.charAt(0);
    }
}
