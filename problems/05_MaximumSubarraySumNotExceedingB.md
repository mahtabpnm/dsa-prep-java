# Maximum Subarray Sum Not Exceeding B

## Problem Description

You are given:

- An integer `A` representing the size of the array.
- An integer `B`.
- An integer array `C` of size `A`.

Your task is to find a **contiguous subarray** such that:

- The sum of its elements is **maximum possible**
- The sum does **not exceed** `B`

Return the maximum valid subarray sum.

If no valid subarray exists, return `0`.

---

## Constraints

- 1 ≤ A ≤ 10^3
- 1 ≤ B ≤ 10^9
- 1 ≤ C[i] ≤ 10^6

---

## Input Format

- The first argument is the integer `A`.
- The second argument is the integer `B`.
- The third argument is the integer array `C`.

---

## Output Format

Return a single integer representing the maximum subarray sum that does not exceed `B`.

---

## Example 1

**Input:**
A = 5  
B = 12  
C = [2, 1, 3, 4, 5]

**Output:**
12

**Explanation:**
The subarray `{3, 4, 5}` has sum 12, which is the maximum possible sum not exceeding `B`.

---

## Example 2

**Input:**
A = 3  
B = 1  
C = [2, 2, 2]

**Output:**
0

**Explanation:**
All elements are greater than `B`, so no valid subarray exists.