# Two Sum

## Problem Statement

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

You may assume that:

- Each input has exactly one valid solution.
- You may not use the same element twice.
- You can return the answer in any order.

## Examples

### Example 1

```text
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
```

**Explanation:**

```text
nums[0] + nums[1] = 2 + 7 = 9
```

Therefore, the answer is:

```text
[0, 1]
```

### Example 2

```text
Input: nums = [3, 2, 4], target = 6
Output: [1, 2]
```

### Example 3

```text
Input: nums = [3, 3], target = 6
Output: [0, 1]
```

## Constraints

- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Only one valid answer exists.

## Follow-up

Can you design an algorithm with a time complexity better than `O(n^2)`?
