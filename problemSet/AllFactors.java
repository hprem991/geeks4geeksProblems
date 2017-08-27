package problemSet;
import java.lang.*;
import java.util.*;

//http://www.geeksforgeeks.org/print-all-prime-factors-of-a-given-number/

public class AllFactors {
	List<Integer> primeFactors(int n){
		List<Integer> res = new ArrayList<Integer>();
		
		// Print the number of 2s that divide n
		while(n % 2 == 0){
			if(!res.contains(2))
				res.add(2);
			n = n / 2;
		}
		
		// n must be odd at this point.  So we can skip 
	    // one element (Note i = i +2)
		for(int i = 3; i < n; i = i + 2){
			while(n % i == 0){
				res.add(i);
				n = n / i;
			}
		}
		
		// This condition is to handle the case when n 
	    // is a prime number greater than 2
		if(n > 2)
			res.add(n);
	}
}
