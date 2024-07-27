class Solution {

    public void function(int index, int nums[], List<List<Integer>> ans, List<Integer> result) {
        if (index >= nums.length) {
            ans.add(new ArrayList<>(result));
            return;
        }

        result.add(nums[index]);
        function(index + 1, nums, ans, result);

        result.remove(result.size() - 1);
        function(index + 1, nums, ans, result);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        int index = 0;
        function(index, nums, ans, new ArrayList<>());
        return ans;

    }
}