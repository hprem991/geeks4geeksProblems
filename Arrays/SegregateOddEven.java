package Arrays;
import java.util.*;
import java.lang.*;

public class SegregateOddEven {
	void segregateOddEven(int arr[]){
		int left = 0;
		int right = arr.length();
		
		while(left < right){
			while((arr[left] % 2 == 0 ) && (left < right)){
				left++;
			}
			while((arr[right] % 2 == 1) && (left < right)){
				right--;
			}
			
			if(left < right) {
				swap(arr[left], arr[right]);
				left++;
				right--;
			}
		}
	}
	
	
	
// Coded during Interview	
	
void segregateArray(int ar[]) {
	int oddIndex = arr.size;
	int evenIndex = 0;				
	while((i < ar.size ) && (j >= 0 )) {
	        for(int i = oddIndex; i< ar.size; i++){
	          if(ar[i]%2 !=0 ) {
	                oddIndex = i;
	                break;
	            } 
	         }

	    for(int j = evenIndex; j >= 0; j++){
	    	if(ar[j]%2 ==0 ) {
	    		evenIndex = j;
	    		break; 
	    		}
	    	}
	   
	    if(oddIndex > evenIndex)
	          swap(a[evenIndex], a[oddIndex]);
	} // End of While
}
