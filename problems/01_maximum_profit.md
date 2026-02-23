# Problem 01 — Maximum Profit

## Problem Statement

You are given an integer array `prices` where:

- `prices[i]` represents the resale value of a car on day `i`.

You may buy one day and sell on a later day.

Return the maximum profit you can achieve.

If no profit is possible, return 0.

---

## Example 1

Input:
[7, 1, 5, 3, 6, 4]

Output:
5

Explanation:
Buy at 1, sell at 6 → Profit = 5

---

## Example 2

Input:
[7, 6, 4, 3, 1]

Output:
0

Explanation:
No profitable transaction is possible.

---

## Constraints

- 1 ≤ prices.length ≤ 10^5
- 0 ≤ prices[i] ≤ 10^4