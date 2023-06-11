package Cdac.PrefixPostfixInfix;

import java.util.Stack;

public class ParenthesisBalance {
    public static void main(String[] args) {
        String s="([{{}])";
        boolean ans= balnced(s);
        System.out.println(ans);
    }

    public static boolean balnced(String s){
        Stack<Character> bal = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
             char sym= s.charAt(i);
             if(sym=='(' || sym=='['||sym=='{' || sym=='<' ){
                 bal.push(sym);
             }
             if(!bal.isEmpty() && sym=='}'||sym==']'||sym==')')
            {  if(sym=='}' && bal.peek()=='{'){
                bal.pop();

            }
               else if(sym==']' && bal.peek()=='['){
                    bal.pop();

                }
                else if(sym==')' && bal.peek()=='(') {
                bal.pop();
            }
                else
                    return false;



             }
        }

        return bal.isEmpty();
    }


}
