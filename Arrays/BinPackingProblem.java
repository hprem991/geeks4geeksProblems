package Arrays;
import java.lang.*;
import java.util.*;


//Given n items of different weights and bins each of capacity c, assign each item to a bin such that number of total used bins is minimized. 

//http://www.geeksforgeeks.org/bin-packing-problem-minimize-number-of-used-bins/
//This problem is a NP Hard problem and finding an exact minimum number of bins takes exponential time. 
//Following are approximate algorithms for this problem.



public class BinPackingProblem {
	//Next Fit Algorithm
	//When processing next item, check if it fits in the same bin as the last item. Use a new bin only if it does not.
	int nextBin(int Weights[], int cap){
		int bins = 0;
		int rem_Weight = 0; // Remaining weight in that bin
		
		for(int i = 0; i < Weights.length; i++){
			if(rem_Weigh > Weights[i]){
				rem_Weight -= Weights[i];
			} else {
				bins++; // Use New Bin
				rem_Weight = cap - Weights[i];
			}
		}
		return bins;
	}
	
	// Similarly we can use Best Fit and First Fit Algorithm to make it tighter but both will be O(n2) algorithms
	
}
