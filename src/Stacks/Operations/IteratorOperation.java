package Stacks.Operations;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class IteratorOperation {
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
        System.out.println("Current Stack: "+stack);

        // Iterating over the Stack
        int index = 0; // Index position for the Stack
        Iterator iterator = stack.iterator();
        while(iterator.hasNext()){
            System.out.println("Element at index "+index+": "+iterator.next());
            index++;
        }
    }
}
