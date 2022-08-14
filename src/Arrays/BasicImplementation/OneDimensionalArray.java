package Arrays.BasicImplementation;

import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args){
        int sizeOfArray = 0; // Variable to store the size of the Array
        // Taking size of Array as User Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements to be stored in the 1-Dimensional Array: ");
        sizeOfArray = scanner.nextInt();

        // Initializing an Array
        int[] arr = new int[sizeOfArray];

        // Storing values in an array using Method 1
        arr[0] = 0;
        arr[1] = 1;
        // Storing values in an array using Method 2
        for(int i=0; i<arr.length;i++){
            System.out.print("\nEnter the value of the element "+(i+1)+": ");
            arr[i] = scanner.nextInt();
        }

        // Display an array
        for(int i=0; i<arr.length;i++){
            System.out.println("Element "+(i+1)+": "+arr[i]);
        }
    }
}
