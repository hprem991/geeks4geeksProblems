package Arrays;

//http://www.geeksforgeeks.org/find-minimum-number-of-merge-operations-to-make-an-array-palindrome/

// Find minimum number of merge operations to make an array palindrome

import java.util.*;
import java.lang.*;

public class ConvertToPalindrome {
	int findMinOps(int[] arr, int n){
		int right = n - 1;
		int operations = 0;
		
		for(int left = 0; left <= right;){
			if(arr[left] == arr[right]){
				left++;
				right--;
			} else if(arr[left] < arr[right]){
				left++;
				arr[left] += arr[left - 1];
				operations++;
			} else if(arr[left] > arr[right]){
				right--;
				arr[right] += arr[left + 1];
				operations++;
			}
		}
		return operations;
	}
}
