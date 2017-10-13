
//Hackerank -> https://www.hackerrank.com/challenges/balanced-brackets/problem


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBracket {

    static String isBalanced(String s) {
        // Complete this function
           Stack<Character> stack = new Stack<Character>();
           for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '(' || c == '{' || c == '['){
                        stack.push(c);
                } else if (!stack.isEmpty()){
                        char peek = stack.peek();
                        if( c == ')'){
                              if(peek == '(')
                                      stack.pop();
                                else
                                       return "NO";
                        } else  if( c == '}'){
                              if(peek == '{')
                                      stack.pop();
                                else
                                      return "NO";
                        } else  if( c == ']'){
                              if(peek == '[')
                                      stack.pop();
                                else
                                       return "NO";
                        }
                }
           }
           if(stack.isEmpty())
                   return "YES";
            else
                    return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
