# Problem 03 — Count Subarrays With Sum K

## Problem Statement

You are given an integer array `nums` and an integer `k`.

Return the total number of continuous subarrays whose sum equals `k`.

A subarray is defined as a contiguous sequence of elements within the array.

---

## Example 1

Input:
nums = [1, 1, 1]
k = 2

Output:
2

Explanation:
The subarrays that sum to 2 are:
[1, 1] (from index 0 to 1)
[1, 1] (from index 1 to 2)

---

## Example 2

Input:
nums = [1, 2, 3]
k = 3

Output:
2

Explanation:
The subarrays that sum to 3 are:
[1, 2]
[3]

---

## Constraints

- 1 ≤ nums.length ≤ 20,000
- -1000 ≤ nums[i] ≤ 1000
- -10^7 ≤ k ≤ 10^7

---

## Requirements

- The solution should run in O(n) time.
- The array may contain negative numbers.
- You must count all valid subarrays.