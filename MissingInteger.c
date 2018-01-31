# CodilityTest18
// you can write to stdout for debugging purposes, e.g.
// printf("this is a debug message\n");

int solution(int A[], int N) {
    // write your code in C99 (gcc 6.2.0)
        for (int i = 0; i < N; ++i)
        {
            int num = A[i];
            while (num <= N && num > 0 && A[num - 1] != num)
            {
                int temp = A[num-1];
                A[num-1]=A[i];
                A[i]=temp;
                num = A[i];
            }
        }
        for (int i = 0; i < N; ++i)
        {
            if (A[i] != i + 1)
            {
                return i + 1;
            }
        }
        return N + 1;
}
