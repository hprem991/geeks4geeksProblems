package Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQTest {

	
	public static void main(String s[]) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		int []a = new int[] {31, 34, 22, 6, 84, 80, 84, 26, 36, 90};
		
		for(int i = 0; i < a.length; i++)
			pq.offer(a[i]);
		
		//System.out.println(pq.size());
		int size = pq.size();
		for(int i = 0; i < size; i++) {
			System.out.println("Pool "+pq.poll());
			//System.out.println("Index "+i+"Size "+pq.size());
			//System.out.println("Peek "+pq.peek());
		}
	}
}
