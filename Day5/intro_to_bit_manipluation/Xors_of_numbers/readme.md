Problem

You are given a number

. You are required to determine the value of the following function:

long long int solve(N)
{
    ans=0;
    for(i=1;i<=N;i++)
    ans+=(N/i);
    return ans;
}

All divisions are integer divisions(i.e. N/i is actually floor(N/i)).

Input format

    First line: 

 denoting the number of test cases
Each of the next
lines: An integer

Output format

For each test case, print the answer in a new line.

Input Constraints

Sample Input

1

5

Sample Output

10