package array;

import java.util.Arrays;

public class Array_Sort {
     public static void main(String[] args) {
    	 int[] numbers = {5, 3, 1, 4, 2};
    	 
    	 //printing the array before sorting
    	 System.out.println("Before sorting: " + Arrays.toString(numbers));
    	 
    	 //sorting the array
    	 Arrays.sort(numbers);
    	 
    	 //printing the sorted array
    	 System.out.println("After sorting: " +Arrays.toString(numbers));
    	 
     }
}
