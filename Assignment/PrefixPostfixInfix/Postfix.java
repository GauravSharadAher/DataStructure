package Cdac.PrefixPostfixInfix;

import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        String post="59+4862/-*-173-$+";
        String pre="+-+59*4-8/62$1-73";
        int ans=prefix(pre);
        int ans2=postfix(post);
        System.out.println("prefix :"+ans);
        System.out.println("postfix :"+ans2);

    }
    public static int postfix(String post){
        //1. if we found the operand push into stack
        Stack<Integer> s=new Stack<>();
        // 2  we traverse the string from left to right
        for (int i = 0; i < post.length(); i++) {
            // 3. fetch the value 1 by one and compare if it
            // is an operand(numeric)
            char c = post.charAt(i);
            if(Character.isDigit(c)){
                // if operand fount push into stack
                // Note : need to convert char to int via intermediate String by parsing
                String str = Character.toString(c);
                s.push(Integer.parseInt(str));
            }
            else{
                // if we found operator then pop 2 element from stack and do the operations
                int b=s.pop();
                int a=s.pop();
                int ans = calculate(a, b, c);
                // after getting answer push it into stack and repeat the process
                // until expression is over  and pop the last element from stack
                // which is the Answer of the expression
                s.push(ans);
            }
        }
        return s.pop();
    }

    public static int prefix(String pre){
        //1. if we found the operand push into stack
        Stack<Integer> s=new Stack<>();
        // 2  we traverse the string from left to right
        for (int i = pre.length()-1; i >=0; i--) {
            // 3. fetch the value 1 by one and compare if it
            // is an operand(numeric)
            char c = pre.charAt(i);
            if(Character.isDigit(c)){
                // if operand fount push into stack
                // Note : need to convert char to int via intermediate String by parsing
                String str = Character.toString(c);
                s.push(Integer.parseInt(str));
            }
            else{
                // if we found operator then pop 2 element from stack and do the operations
                int a=s.pop();
                int b=s.pop();
                int ans = calculate(a, b, c);
                // after getting answer push it into stack and repeat the process
                // until expression is over  and pop the last element from stack
                // which is the Answer of the expression
                s.push(ans);
            }
        }
        return s.pop();
    }

    private static int calculate(int x,int y,char op) {
        return switch (op) {
            case '$' -> (int) Math.pow(x, y);
            case '*' -> x * y;
            case '/' -> x / y;
            case '%' -> x % y;
            case '+' -> x + y;
            case '-' -> x - y;
            default -> 0;
        };
    }
}
