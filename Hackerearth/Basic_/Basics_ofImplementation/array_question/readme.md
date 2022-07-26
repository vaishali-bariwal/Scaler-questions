Problem

You are given an array A of N integers. If you make the array whole using the following operation, then what is the minimum number of operations required to make the entire array even?

Note: It can be proved that this is always possible.

Operation

Select an index  

  and perform operation:

P=Ai+Ai+1; Q=Ai-Ai+1;

Ai=P; Ai+1=Q;

Input format

    The first line contains an integer T denoting the number of the test cases.
    In each test case:
        The first line contains an integer N denoting the number of elements in the array.
        The second line contains N space-separated integers of array A.

Output format

For each test case print a single line denoting the minimum number of operations required to make the whole array even.

Constraints

    Sum of N over all test cases will not exceed 200000

Sample Input

1

4

1 3 2 2

Sample Output

1

Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation

If we choose index 1 A1=1+3=4 and A2=1-3=-2.

So only one operation is required to make array even.
