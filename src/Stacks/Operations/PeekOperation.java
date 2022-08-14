package Stacks.Operations;

import java.util.Scanner;
import java.util.Stack;

public class PeekOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter the number of elements to be inserted into the Stack: ");
        int numberOfElements = scanner.nextInt();

        for(int i=0;i<numberOfElements;i++){
            System.out.print("Enter the Element "+(i+1)+" to be inserted: ");
            int temp = scanner.nextInt();
            stack.push(temp);
        }
        System.out.println("Stack: "+stack);

        // Popping element from the Stack
        stack.pop();
        System.out.println("Stack: "+stack);

        // Peeking from the Stack
        int peekElement = stack.peek();
        System.out.println("The element present on top of stack is: "+peekElement);
    }
}
