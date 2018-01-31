// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
		if(A == null || A.length == 0) {
			return 0;
		}
		
		if(A.length == 1) {
			return A[0];
		}
		
		int result = 0;
		for(int i = 0; i < A.length; i++) {
			result ^= A[i];
		}
		
		return result;
	}
}
