package LinkedList;
import java.lang.*;
import java.util.*;

import javax.xml.soap.Node;

//http://www.geeksforgeeks.org/sort-a-linked-list-of-0s-1s-or-2s/
//Given a linked list of 0s, 1s and 2s, sort it.

public class Sort3UniqueElements {
	 void sortList(Node head){
		 
		 Node headref = head;
		// initialise count of 0 1 and 2 as 0
		 int count[] = {0 , 0,  0};
		 
		 
		 /* count total number of '0', '1' and '2'
	        * count[0] will store total number of '0's
	        * count[1] will store total number of '1's
	        * count[2] will store total number of '2's  */
		 
		 while(headref != null){
			 count[headref.value]++;
			 headref = headref.next; 
		 }
		 
		 int i = 0;
		 headref = head;
		 
		 /* Let say count[0] = n1, count[1] = n2 and count[2] = n3
	        * now start traversing list from head node,
	        * 1) fill the list with 0, till n1 > 0
	        * 2) fill the list with 1, till n2 > 0
	        * 3) fill the list with 2, till n3 > 0  */
		 
		 while(headref != null){
			 if(count[i] == 0){
				 i++;
			 } else {
				 headref.val = i;
				 count[i]--;
				 headref = headref.next;
			 }
		 }
	 }
}
