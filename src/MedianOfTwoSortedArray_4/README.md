# 4. Median of Two Sorted Arrays

**Difficulty:** Hard

## Problem Statement

Given two sorted arrays `nums1` and `nums2` of sizes `m` and `n`, return the median of the two sorted arrays.

The overall runtime complexity should be:

```text
O(log(m + n))
```

## Examples

### Example 1

```text
Input: nums1 = [1, 3], nums2 = [2]
Output: 2.00000
```

**Explanation:**

After merging:

```text
[1, 2, 3]
```

The middle element is `2`, so the median is:

```text
2.00000
```

### Example 2

```text
Input: nums1 = [1, 2], nums2 = [3, 4]
Output: 2.50000
```

**Explanation:**

After merging:

```text
[1, 2, 3, 4]
```

There are two middle elements: `2` and `3`.

```text
Median = (2 + 3) / 2
       = 2.5
```

Therefore:

```text
2.50000
```

## Median Rule

For an odd number of elements:

```text
Median = middle element
```

For an even number of elements:

```text
Median = (first middle element + second middle element) / 2
```