package Arrays.BasicImplementation;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args){
        int numberOfRows = 0; // Variable to store the number of rows of the Array
        int numberOfColumns = 0; // Variable to store the number of columns of the Array

        // Taking size of Array as User Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the 2-Dimensional Array: ");
        numberOfRows = scanner.nextInt();
        System.out.print("Enter the number of columns for the 2-Dimensional Array: ");
        numberOfColumns = scanner.nextInt();

        // Initializing an Array
        int[][] arr = new int[numberOfRows][numberOfColumns];

        // Storing values in an array using Method 1
        arr[0][0] = 0;
        arr[1][0] = 1;
        // Storing values in an array using Method 2
        for(int i=0; i<arr.length;i++){
            System.out.println("Row Index: "+(i+1)+"\n");
            for(int j=0; j<arr[i].length;j++){
                System.out.print("Enter the value of the element "+(j+1)+": ");
                arr[i][j] = scanner.nextInt();
            }
        }

        // Display an array
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("Element: "+arr[i][j]);
            }
        }

        // Display an array
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
