import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (isValid(s)) {
                answer++;
            }
            s = Left(s);
        }
        
        return answer;
    }
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else {
            if (stack.isEmpty()) {
                return false;
            }
            char open = stack.pop();
            if ((c == ')' && open != '(') || (c == '}' && open != '{') || (c == ']' && open != '[')) {
                return false;
            }
        }
    }
        
        return stack.isEmpty();
    }
    
    public String Left(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        
        return str.substring(1) + str.charAt(0);
    }
}
