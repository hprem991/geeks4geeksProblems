package Arrays;

import java.lang.*;
import java.util.*;

public class PrintTopK {
	int [] printTopK(int arr[], int k){
		Queue<Integer> pq = new PriorityQueue<Integer>(); // Using Normal Comparator
		int result[] = new int[k];
		for(int i = 0; i < arr.length; i++){
			pq.offer(arr[i]);
			if(pq.size() > k) // This is Optimisation, may not be required for my case 
				pq.poll();
		}
		
		for(int i = 0; i < k ; i++)
			result[i] = pq.poll();
		
		return result; 
	}
}
