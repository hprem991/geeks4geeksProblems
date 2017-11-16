package Tree;

import java.lang.*;
import java.util.*;

class Node {
	int value;
	Node left, right;
}


public class SumLevel {
	vector<int> sum;
	
	void sumLevel(Node node, int level){
		if(node == NULL)
			return;
		sum[level] += node.value;
		level++;
		sumLevel(node.left, level);
		sumLevel(node.right, level);
	}
}
