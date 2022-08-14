package Stacks.Operations;

import java.util.Scanner;
import java.util.Stack;

public class SearchOperation {
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

        System.out.print("\nEnter the element to search in the Stack: ");
        int elementToSearchInStack = scanner.nextInt();
        if(stack.isEmpty()){
            System.out.println("The Stack is empty!");
        }
        else{
            int indexOfSearchElement = stack.search(elementToSearchInStack);
            if(indexOfSearchElement==-1){
                System.out.println("Element is not present in the Stack!");
            }
            else{
                System.out.println("The required element is present at index: "+indexOfSearchElement);
            }
        }
    }
}
