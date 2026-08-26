class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for(var it : ch){
            if(it == '[' || it == '{' || it == '('){
                stack.push(it);
            }else{
                if(stack.size() == 0){
                    return false;
                }

                if(stack.peek() == '(' && it == ')' ||
                stack.peek() == '[' && it == ']' ||
                stack.peek() == '{' && it == '}' ){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.size() == 0;
    }
}