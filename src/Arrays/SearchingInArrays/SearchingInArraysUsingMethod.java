package Arrays.SearchingInArrays;

import java.util.Scanner;

public class SearchingInArraysUsingMethod {
    public static int searchInArray(int arr[], int elementToSearch){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==elementToSearch){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Initializing an Array directly
        int[] arr = new int[]{6,3,7,1,8,5,2,4,9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search in the Array: ");
        int elementToSearch = scanner.nextInt();
        int positionOfRequiredElementInArray = searchInArray(arr, elementToSearch);
        if(positionOfRequiredElementInArray==-1){
            System.out.println("Element not Found in Array!");
        }
        else{
            System.out.println("Position of required element: "+positionOfRequiredElementInArray);
        }
    }
}
