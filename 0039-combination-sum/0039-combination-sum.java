class Solution {

    public void solve(int[] candidates, int idx, int target,
                      List<Integer> ds,
                      List<List<Integer>> ans) {

        if (idx == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // Take
        if (candidates[idx] <= target) {
            ds.add(candidates[idx]);

            // stay at same index because we can reuse elements
            solve(candidates, idx, target - candidates[idx], ds, ans);

            ds.remove(ds.size() - 1);
        }

        // Not Take
        solve(candidates, idx + 1, target, ds, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        solve(candidates, 0, target, new ArrayList<>(), ans);

        return ans;
    }
}