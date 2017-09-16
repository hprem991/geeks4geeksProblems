package Arrays;
import java.lang.*;
import java.util.*;

public class MaximumSubsequenceSum {
	
	// Maxing the Sum
	int maxSubSequenceSum(int arr[]){
		int dp[] = new int[arr.length];
		
		int max  = 0;
		
		for(int i = 1; i < arr.length; i++){
			for(int j = 0; j < i; j++){
				if(arr[j] < arr[i]){
					dp[i] = Math.max(dp[i], dp[j] + arr[i]);
				}
			}
		}

		for(int i = 0 ; i < dp.length; i++)
			max = Math.max(max, dp[i]);
		
		return max;
	}
	
	//Maximum Length 
	int maxSubSequenceLength(int arr[]){
		int dp[]  = new int[arr.length];
		
		int max = 0;
		
		for(int i = 1; i < arr.length; i++){
			for(int j = 0; j < i; j++){
				if(arr[j] < arr[i]){
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		
		for(int i = 0; i < dp.length; i++)
			max = Math.max(max, dp[i]);
		return max;
	}
}
