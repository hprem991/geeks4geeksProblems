package Arrays;
import java.lang.*;
import java.util.*;


//Given an integer array, find a maximum product of a triplet in array.


//http://www.geeksforgeeks.org/find-maximum-product-of-a-triplet-in-array/
// Array can have the negative values as well


/* Examples 
  Input:  [10, 3, 5, 6, 20]
  Output: 1200
  Multiplication of 10, 6 and 20
 
  Input:  [-10, -3, -5, -6, -20]
  Output: -90

  Input:  [1, -4, 3, -6, 7, 0]
  Output: 168
 */


public class MaximumProductOfThree {
	
	int maximumProductOfThree(int arr[]){
		if(arr.length < 3)
				return 0;
		Arrays.sort(arr);
		// Return the maximum of product of last three
	    // elements and product of first two elements
	    // and last element
		return Math.max(arr[0] * arr[1] * arr[2], arr[arr.length - 1] * arr[arr.length - 2] * arr[0]);
	}
	
	
	// The Above algorithm can be reduced from O(nlogn) to O(n) but just scanning for 3 maximum and 2 minimum values
	
	//1> Scan the array and compute Maximum, second maximum and third maximum element present in the array.
	//2> Scan the array and compute Minimum and second minimum element present in the array.
	//3> Return the maximum of product of Maximum, second maximum and third maximum and product of Minimum, second minimum and Maximum element.
	//Note – Step 1 and Step 2 can be done in single traversal of the array.
	
}
