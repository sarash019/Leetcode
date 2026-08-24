class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[temp.length];

        for(int i = temp.length-1; i >= 0; i--){
            
            while(!s.isEmpty() && temp[s.peek()] <= temp[i]){
                s.pop();
            }

            if (!s.isEmpty()) {
                ans[i] = s.peek() - i;
            } else {
                ans[i] = 0;
            }

            s.push(i);

            
        }
        return ans;
    }
}