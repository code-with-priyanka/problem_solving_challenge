import java.util.Stack;

class Solution8{

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // If opening bracket → push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If closing bracket
            else {

                // If stack empty → invalid
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Stack must be empty
        return stack.isEmpty();
    }

    // Main Method
    public static void main(String[] args) {

        Solution8 obj = new Solution8();

        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([])";
        String s5 = "([)]";

        System.out.println(obj.isValid(s1)); // true
        System.out.println(obj.isValid(s2)); // true
        System.out.println(obj.isValid(s3)); // false
        System.out.println(obj.isValid(s4)); // true
        System.out.println(obj.isValid(s5)); // false
    }
}

