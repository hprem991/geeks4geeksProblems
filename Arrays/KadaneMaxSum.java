package Arrays;
import java.lang.*;
import java.util.*;

public class KadaneMaxSum {
	int Kadane(int arr[]){
		int maxSum  = Integer.MIN_VALUE;;
		int sum_soFar = 0;
		
		for(int i = 0; i < arr.length; i++){
			sum_soFar = sum_soFar + arr[i];
		
			if(maxSum < sum_soFar)
				maxSum = sum_soFar;
			
			if(sum_soFar < 0) // Reset the maxCalc
				sum_soFar = 0;
		}
		return maxSum;
	}
}
