class Solution {
    public void com(int curr, int limit, int size, List<List<Integer>> res, List<Integer> temp) {
        if (temp.size() == size) {
            res.add(new ArrayList<>(temp));
            return;
        }
        if (curr > limit || temp.size() + (limit - curr + 1) < size) {
            return;
        }
        temp.add(curr);
        com(curr + 1, limit, size, res, temp);
        temp.remove(temp.size() - 1);
        com(curr + 1, limit, size, res, temp);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        com(1, n, k, res, new ArrayList<>());
        return res;
    }
}