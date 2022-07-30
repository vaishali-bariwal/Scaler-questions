You are given an integer n and a string s of size n composed of lower case english letters.

You can perform the following operation on it:

    In one operation, you have to choose any character in the string s, then delete the first character to the left of the chosen character that is equal to the chosen character (if there exists) and delete the first character to the right of the chosen character that is equal to the chosen character (if there exists). 
    Note that in one operation, the length of the string s is reduced by a maximum of two characters.

Task

You want to minimize the length of the string s.

Find the minimum number of operations that need to be performed to minimize the length of the string s.

Note:

    Assume 1 based indexing.

Example

Assumptions :

    n = 4
    s = "abaa" (without quotes)

Approach:

    Choose 3rd character in the string for 1st operation, this will delete the 1st character and 4th character in string s, the string becomes "ba".
    The length of the string s can not be reduced further.
    Hence, minimum number of operations needed to reduce the length of the string s to a minimum is 1.

Function Description

Complete the Minimum_Operations function provided in the editor. This function takes the following 2 parameters and returns the required answer:

    n: Represents the length of string s.
    s: Represents the string s.

Input format

Note: This is the input format that you must use to provide custom input (available above the Compile and Test button).

    The first line contains a single integer T, which denotes the number of test cases. T also specifies the number of times you have to run the Minimum_Operations function on a different set of inputs.
    For each test case:
        First line contains an integer n.
        Second line contains a string s.

Output format

For each test case in a new line, print the minimum number of operations required to minimize the length of string s.

Constraints

Code snippets (also called starter code/boilerplate code) 

This question has code snippets for C, CPP, Java, and Python.

 
Sample Input

2
7
babbaaa
3
abc

Sample Output

3
0

Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation

For first test case:

Given

    n = 7
    s = "babbaaa" (without quotes)

Approach:

    Choose 3rd character in the string for 1st operation, this will delete the 1st character and 4th character in string s, the string becomes "abaaa".
    Choose 3rd character in the string for 2nd operation, this will delete the 1st character and 4th character in string s, the string becomes "baa".
    Choose 3rd character in the string for 3rd operation, this will delete the 2nd character in string s, the string becomes "ba".
    The length of the string s can not be reduced further.
    Hence, the minimum number of operations needed to reduce the length of the string s to a minimum is 3.

For second test case:

Given

    n = 3
    s = "abc" (without quotes)

Approach:

    The length of the string s can not be reduced further.
    Hence, the minimum number of operations needed to reduce the length of the string s to a minimum is 0.
