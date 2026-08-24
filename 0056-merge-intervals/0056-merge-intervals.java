class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        ArrayList<int[]> ans = new ArrayList<>();
        
        for (var pairs : intervals) {
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < pairs[0]) {
                ans.add(pairs);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], pairs[1]);
            }
        }
        
        return ans.toArray(new int[ans.size()][2]);
    }
}