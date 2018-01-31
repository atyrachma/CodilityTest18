// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int binaryGap = 0;
        boolean found_one = false;

        for (int j = 0; N > 0; N /= 2) {
            if (N % 2 == 0) {
                j++;
            } else {
                if (j > binaryGap && found_one == true){
                    binaryGap = j;
                }
                found_one = true;
                j = 0;
            }
        }

    return binaryGap;
    }
}
