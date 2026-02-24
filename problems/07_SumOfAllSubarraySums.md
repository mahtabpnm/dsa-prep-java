# Sum of All Subarray Sums

## Problem Description

You are given an integer array `A` of length `N`.

You have to find the **sum of all subarray sums** of `A`.

More formally:

- A subarray is a contiguous part of an array that can be obtained by deleting zero or more elements from the beginning or the end of the array.
- The sum of a subarray is the sum of all elements in that subarray.

Return the total sum of all subarray sums.

⚠️ Note: Be careful about integer overflow. Use appropriate data types.

---

## Constraints

- 1 ≤ N ≤ 10^5
- 1 ≤ A[i] ≤ 10^4

---

## Input Format

- The only argument is an integer array `A`.

---

## Output Format

Return a single integer representing the sum of all subarray sums.

---

## Example 1

### Input
A = [1, 2, 3]

### Output
20

### Explanation

All subarrays:

- [1]
- [2]
- [3]
- [1, 2]
- [2, 3]
- [1, 2, 3]

Their sums:

1 + 2 + 3 + 3 + 5 + 6 = 20

---

## Example 2

### Input
A = [2, 1, 3]

### Output
19

### Explanation

All subarrays:

- [2]
- [1]
- [3]
- [2, 1]
- [1, 3]
- [2, 1, 3]

Their sums:

2 + 1 + 3 + 3 + 4 + 6 = 19

---

## Approach

Instead of iterating over all subarrays (which would take O(N²)),
we calculate how many times each element contributes to the final answer.

For an element at index `i`:

- It can be the start of `(N - i)` subarrays.
- It can be the end of `(i + 1)` subarrays.

Total contribution of `A[i]`:

A[i] × (i + 1) × (N - i)

We sum this for all elements.

---

## Time Complexity

O(N)

We iterate through the array once.

---

## Space Complexity

O(1)

We use only a few extra variables.