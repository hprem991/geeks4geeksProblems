package Arrays;
import java.lang.*;
import java.util.*;


// This problem is to find the weight of a ball which is different from the list of other balls
// 8 ball problem

public class GetWeight {
	
	
	// This function is to balance the two side of the pan and check which one is heavier
	int balance(int balls[], int firstLow, int firstHigh, int secondLow, int secondHigh){
		int lowerWeight = 0;
		int higherWeight = 0;
		
		for(int i = firstLow; i <= secondHigh; i++){
			if(i >= firstLow &&  i <= firstHigh)
				lowerWeight += balls[firstLow];
			
			if(i >= secondLow &&  i <= secondHigh)
				higherWeight += balls[firstLow];
		}
		
		if(lowerWeight == higherWeight)
			return 0;
		return lowerWeight > higherWeight ? 1 : -1;
	}
	
	// This is auxillary function to calculate the weight
	int getWeight(int balls[], int low, int high, int step){
		if(high < low)
			return 0;
		if(balls.length == 1)
			return 1;
		int noOfBalls =  ( high - low ) / 3;
		
		if(balance(arr, low, low + noOfBalls, low + noOfBalls + 1, low + 2 * noOfBalls) >= 0)
			return getWeight(balls[], low, low + noOfBalls, step++);
		if(balance(arr, low, low + noOfBalls, low + noOfBalls + 1, low + 2 * noOfBalls) <= 0)
			return getWeight(balls[], low + noOfBalls + 1, low + 2 * noOfBalls, step++);
		else 
			return getWeight(balls[], low + 2 * noOfBalls + 1, high, step++);
	}
	
	public int getWeight(int balls[]){
		return getWeight(ball, 0, balls.length, 0);
	}
}
