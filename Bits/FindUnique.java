package Bits;
	
import java.util.*;
import java.lang.*;

//Given an array where every element occurs three times, except one element which occurs only once
//http://www.geeksforgeeks.org/find-the-element-that-appears-once/

// NOTE: Better Solution to this problem in leetCode.Medium, this is just another approach

/*
 * 
Let us consider the example array {5, 5, 5, 8}. The 101, 101, 101, 1000
Sum of first bits%3 = (1 + 1 + 1 + 0)%3 = 0;
Sum of second bits%3 = (0 + 0 + 0 + 0)%0 = 0;
Sum of third bits%3 = (1 + 1 + 1 + 0)%3 = 0;
Sum of fourth bits%3 = (1)%3 = 1;
Hence number which appears once is 1000
 */

public class FindUnique {
	public int getSingle(int arr[], int n){
		int result = 0;
		int counter = 0;
		int bitSet = 0;
		// Position Counter
		for(int i=0; i < 32; i++){ // Assuming its 32 bit Integer collection
			counter = 0;
			bitSet = 1 << i; 
			for(int elem = 0; elem < n; elem++){
				if((bitSet & arr[elem]) == 0)
					counter++;
			}
			if((counter % 3) == 0) 
				result |= bitSet;
		}
		return result;
	}
}
