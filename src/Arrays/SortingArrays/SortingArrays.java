package Arrays.SortingArrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        // Initializing an Array directly
        int[] arr = new int[]{6,3,7,1,8,5,2,4,9};

        System.out.println("The Initial Array which we have is: ");
        for(int i=0;i<arr.length;i++){
            System.out.println("Element "+(i+1)+": "+arr[i]);
        }

        // Sorting the array using the Built-in Method
        Arrays.sort(arr);

        System.out.println("The Array after performing the sorting Operation is: ");
        for(int i=0;i<arr.length;i++){
            System.out.println("Element "+(i+1)+": "+arr[i]);
        }
    }
}
