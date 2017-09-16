package Arrays;
import java.lang.*;
import java.util.*;

/*
 * Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that prod[i] is equal
 * to the product of all the elements of arr[] except arr[i]. Solve it without division operator and in O(n).
 */

//http://www.geeksforgeeks.org/a-product-array-puzzle/

// Idea is to hold one step old product result into new array and traverse up and down

public class ProductArrayWithoutItself {
	 void productArray(int arr[]) 
	    {
		 	int n = arr.length;
		 	int prod[] = new int[n];
		 	
		 	int temp = 1;
		 	
		 	 /* In this loop, temp variable contains product of
	          elements on left side excluding arr[i] */
		 	for(int i = 0; i < n; i++){
		 		prod[i] = temp;
		 		temp = temp * arr[i];
		 	}
		 	
		 	// reinit
		 	temp = 1;
		 	
		    /* In this loop, temp variable contains product of
	           elements on right side excluding arr[i] */
		 	for(int i =  n - 1; i >=0; i--){
		 		prod[i] = prod[i] * temp;
		 		temp = temp * arr[i];
		 	}
		 	
		 	for(int i = 0; i < n; i++){
		 		System.out.println(arr[i]);
		 	}
		 	
	    }
}
