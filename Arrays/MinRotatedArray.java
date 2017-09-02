package Arrays;
import java.lang.*;
import java.util.*;

//http://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
public class MinRotatedArray {
  /*
   *	 Find the minimum element in a sorted and rotated array
   *	 A sorted array is rotated at some unknown point, find the minimum element in it.
   */
	
	
	/* APPROACH : A simple solution is to traverse the complete array and find minimum. This solution requires Θ(n) time.
					
		We can do it in O(Logn) using Binary Search. If we take a closer look at above examples, we can easily figure out following pattern:

		The minimum element is the only element whose previous is greater than it. If there is no previous element element, then there is no rotation (first element is minimum). We check this condition for middle element by comparing it with (mid-1)’th and (mid+1)’th elements.
		If minimum element is not at middle (neither mid nor mid + 1), then minimum element lies in either left half or right half.
		If middle element is smaller than last element, then the minimum element lies in left half
		Else minimum element lies in right half.
	*/
	
  int findMin(int arr[],  int low, int high){
	  // This condition is needed to handle the case when array
      // is not rotated at all
      if (high < low)  return arr[0];

      // If there is only one element left
      if (high == low) return arr[low];

      // Find mid
      int mid = low + (high - low)/2; /*(low + high)/2;*/

      // Check if element (mid+1) is minimum element. Consider
      // the cases like {3, 4, 5, 1, 2}
      if (mid < high && arr[mid+1] < arr[mid])
          return arr[mid+1];

      // Check if mid itself is minimum element
      if (mid > low && arr[mid] < arr[mid - 1])
          return arr[mid];

      // Decide whether we need to go to left half or right half
      if (arr[high] > arr[mid])
          return findMin(arr, low, mid-1);
      return findMin(arr, mid+1, high);
  }
}
