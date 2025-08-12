class Solution {
    public void getAll(int[] candidates, int idx, int target, List<List<Integer>> ans, List<Integer> combin) {
        if (target == 0) {
            ans.add(new ArrayList<>(combin)); // store a copy
            return;
        }
        if (idx == candidates.length || target < 0) {
            return;
        }
        
        // Pick the element
        combin.add(candidates[idx]);
        getAll(candidates, idx, target - candidates[idx], ans, combin); // allow reuse
        combin.remove(combin.size() - 1); // backtrack
        
        // Skip the element
        getAll(candidates, idx + 1, target, ans, combin);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        getAll(candidates, 0, target, ans, new ArrayList<>());
        return ans;
    }
}
