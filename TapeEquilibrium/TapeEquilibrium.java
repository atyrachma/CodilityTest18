// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long rsum = 0;
 
        for (int i = 1; i < A.length; i++)
            rsum += A[i];
     
        long lsum = A[0];
        int min = (int) Math.abs(lsum - rsum);
        for (int i = 1; i < A.length-1; i++) {
            lsum += A[i];
            rsum -= A[i];
            int diff = (int) Math.abs(lsum - rsum);
            if (diff < min)
                min = diff;
        }
     
    return min;
    }
}
