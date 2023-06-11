package Cdac.PrefixPostfixInfix;

import java.util.Stack;

public class Infix2Postfix {
    public static void main(String[] args) {
        String s="5+9-4*(8-6/2)+1$(7-3)";
        String ans=postfix(s);
        System.out.println(ans);

    }
    public static String postfix(String s){
        // we use String builder bcz we need to concate str everytime
        //so appending makes easy
        StringBuilder str= new StringBuilder();
        // Stack created and operator are pushed in stack
        Stack<Character> stk = new Stack<>();
        // 3 iterate from left to right
        for (int i = 0; i < s.length(); i++) {
            char sym= s.charAt(i);
            if(Character.isDigit(sym)){
                // if operands ais found append to string
                str.append(sym);
            }
            // opening bracket found
            else if(sym=='('){
                // if opening '(' bracket is found we continue tho push elemnts
                // until closing is found ')'
                stk.push(sym);
            }
            else if(sym ==')') {
                // if closing is found then pop all the elements from stack and append it to string
                while (stk.peek() != '(') {
                    str.append(stk.pop());
                }
                // if we found closing then discard that brackets and continue the process
                stk.pop();
            }
            else{
                // if operator found push it to stack and check priority or precendence
                // of  operator having higher priority than below then push it in stack
                // if not fount then append it to string
                while( !stk.isEmpty() && precedence(stk.peek()) >=precedence(sym)){
                    str.append(stk.pop());
                }
                stk.push(sym);
            }
        }
        // append until whole stack is not emptied
        while(!stk.isEmpty()){
            str.append(stk.pop());
        }
        // As we used String Builder we need to convert into string
        return str.toString();
    }

    private static int precedence(char op) {
        return switch (op) {
            case '$' -> 5;
            case '*' -> 4;
            case '/' -> 4;
            case '%' -> 4;
            case '+' -> 3;
            case '-' -> 3;
            default -> -1;
        };
    }
}
