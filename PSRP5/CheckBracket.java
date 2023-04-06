package Task;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckBracket {
    public static void main(String[] args) {
       // String exp = "[()]{}{[()()]()}";
        String exp = "[(])";

        boolean flag = areBracketBalanced(exp);
        if(flag)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

    }

    private static boolean areBracketBalanced(String exp) {

        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);
            if(c == '{' || c == '[' || c=='('){
                stack.push(c);
                continue;
            }
            if(stack.isEmpty())
                return false;
            char check;
            switch (c){
                case '}':
                    check = stack.pop();
                    if(check == '[' || check == '(')
                        return false;
                    break;

                case ']' :
                    check =stack.pop();
                    if(check=='{' || check == '(')
                        return false;
                    break;

                case ')' :
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

            }
        }

        return stack.isEmpty();
    }
}
