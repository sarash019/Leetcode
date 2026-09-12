class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] anss = new int[n+1][2];
        int ind = 0;
        for(var it : intervals){
            anss[ind++] = it;
        }

        anss[ind] = newInterval;

        Arrays.sort(anss, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> ans = new ArrayList<>();

        for (var pairs : anss) {
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < pairs[0]) {
                ans.add(pairs);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], pairs[1]);
            }
        }
        return ans.toArray(new int[ans.size()][2]);
        
    }
}