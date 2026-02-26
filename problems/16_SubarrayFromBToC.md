# Subarray From B to C

## Problem Description

Given an array `A` of length `N`, return the subarray starting from index `B` to index `C` (inclusive).

---

## Constraints

- 1 <= N <= 10^5
- 1 <= A[i] <= 10^9
- 0 <= B <= C < N

---

## Input

- `A`: An array of integers
- `B`: Starting index
- `C`: Ending index

---

## Output

Return the subarray from index `B` to index `C` (inclusive).

---

## Example 1

Input:
A = [4, 3, 2, 6]  
B = 1  
C = 3

Output:
[3, 2, 6]

---

## Example 2

Input:
A = [4, 2, 2]  
B = 0  
C = 1

Output:
[4, 2]

---

## Approach

We extract elements from index `B` to `C` inclusive.

In Java, this can be done using a loop to create a new array of size `(C - B + 1)`.

Time Complexity: O(C - B + 1)  
Space Complexity: O(C - B + 1)
