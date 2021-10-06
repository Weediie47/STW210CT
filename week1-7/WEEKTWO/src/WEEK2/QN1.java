package WEEK2;

import java.util.*;

public class QN1 {
    // Checking balanced brackets

    public static void main(String[] args)
    {
        String input = "{()}{}";

        if (areBracketsBalanced(input))
            System.out.println("True ");
        else
            System.out.println("False ");
    }


        // function to check if brackets are balanced
        static boolean areBracketsBalanced(String input)
        {
            
            Stack<Character> stack = new Stack<Character>();//read

            // TO Traverse the input
            for (int i = 0; i < input.length(); i++)
            {
                char x = input.charAt(i);

                if (x == '(' || x == '[' || x == '{')
                {
                    // To push the element in the stack
                    stack.push(x);
                    continue;
                }

// If current character is not opening bracket, then it should be closing. So the stack cannot be empty at this point.
                if (stack.isEmpty())
                    return false;
                char check;
                switch (x) {
                    case ')':
                        check = stack.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;

                    case '}':
                        check = stack.pop();
                        if (check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = stack.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }
            }

            // TO check Empty Stack
            return (stack.isEmpty());
        }



    }
