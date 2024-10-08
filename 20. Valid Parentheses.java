// Given a string s containing just the characters '(', ')', '{', '}', '['
// and ']',
// determine if the input string is valid.
// An input string is valid if:
// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brackets must be closed in the correct order.
// 3. Every close bracket has a corresponding open bracket of the same type.
public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
        switch (c) {
            case '(':
            case '[':
            case '{':
                stack.push(c);
                break;
            case ')':
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
                break;
            case ']':
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
                break;
            case '}':
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
                break;
        }
    }
    return stack.isEmpty();
}