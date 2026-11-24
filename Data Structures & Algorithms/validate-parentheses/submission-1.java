
class Solution {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                myStack.push(c);
            } else {
                if(myStack.isEmpty()) {
                    return false;
                }
                char opener = myStack.pop();
                if(c == ']' && opener != '[') {
                    return false;
                } else if(c == '}' && opener != '{') {
                    return false;
                } else if(c == ')' && opener != '(') {
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }
}
