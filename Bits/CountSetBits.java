package Bits;
import java.lang.*;
import java.util.*;

//http://www.geeksforgeeks.org/count-number-of-bits-to-be-flipped-to-convert-a-to-b/
//Given two numbers ‘a’ and b’. Write a program to count number of bits needed to be flipped to convert ‘a’ to ‘b’.


// 1. Calculate XOR of A and B.      
//		a_xor_b = A ^ B
// 2. Count the set bits in the above 
//				calculated XOR result.
//				countSetBits(a_xor_b)


public class CountSetBits {
		
		int countSetBits(int a, int b){
			int bitsToCount = a ^ b;
			int bitsSet = 0;
			while(bitsToCount){
				bitsToCount = bitsToCount >> 1;
				if(bitsToCount)
			    	bitsSet++;
			}
			return count;
		}
}
