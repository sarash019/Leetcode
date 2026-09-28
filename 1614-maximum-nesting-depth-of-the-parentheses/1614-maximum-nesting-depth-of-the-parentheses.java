class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        int max = 0;
        for(var it : ch){
            if(it == '('){
                stack.push(it);
            }else if(it == ')'){
                stack.pop();
            }else{
                continue;
            }
            max = Math.max(max, stack.size());
        }
        return max;
    }
}