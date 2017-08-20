package Arrays;

import java.lang.*;
import java.util.*;


//http://www.geeksforgeeks.org/print-all-subarrays-with-0-sum/

public class PrintSumWithZero {
	public List<String> SumWithZero(int arr[]){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // Mapping of sum to Indices
		int sum = 0 ; // use for capturing running sum
		List <String> result = new ArrayList<String>();
		for(int i = 0; i < arr.length ; i++){
			sum += arr[i];
			
			if(sum == 0){
				//Straight case, sum became 0 from index 0 to index i
				result.add("Got Sum as 0 from Index 0 to "+i);
			}
			
			if(map.containsKey(sum)){
				int startIndex = map.get(sum);
				result.add("Got Sum as 0 from Index "+startIndex+" to "+i);
			}
			map.put(sum, i);
		}
		return result;
	}
}
