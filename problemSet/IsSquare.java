package problemSet;
import java.lang.*;
import java.util.*;


class Point{
	int x,y;
}

public class IsSquare {
	
	int dist(Point p, Point q) {
		return (p.x - q.x) * (p.x - q.x) + (p.y - q.y) * (p.y - q.y);
	}
	public boolean isSquare(Point a, Point b, Point c, Point d) {
	    int distAB =  dist(a, b);
	    int distAC =  dist(a, c);
	    int distAD =  dist(a, d);
	    
	    if(distAB == distAC) { // This means, B and C are the neighbors of A
	    	// Check diagonal
	    	return dist(a, d) == dist(b, c) ? true : false;
 	    } 
	    if( distAB == distAD ) { // This means. B and D are the neighbors of A
	    	return dist(a, c) == dist(b, d) ? true : false;
	    }	
	    if( distAC == distAD) { // This means, C and D are the neighbors of A
	    	return dist(a, b) == dist(c, d) ? true : false;
	    }
	    return false;
	}
}
