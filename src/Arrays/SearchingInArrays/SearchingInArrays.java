package Arrays.SearchingInArrays;

import java.util.Scanner;

public class SearchingInArrays {
    public static void main(String[] args) {
        // Initializing an Array directly
        int[] arr = new int[]{6,3,7,1,8,5,2,4,9};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the element to search in the Array: ");
        int elementToSearch = scanner.nextInt();

        int positionOfRequiredElement = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==elementToSearch){
                positionOfRequiredElement = i;
                break;
            }
        }

        System.out.println("Position of the required element is: "+positionOfRequiredElement);
    }
}
