# Solution Guide

## How the Program Works

The program finds two numbers whose sum is equal to the given `target`.

## Step-by-Step Explanation
* create an array of size 2 to store ans
* create a hash map to store number and its index
* loop through the array to find the required number
* use substraction to find the required number
* check if the required number is already in the hash map
* store the current number and index in the hash map 

### First iteration

```text
i = 0
current number = 2
difference = 9 - 2 = 7
```

`7` is not in the HashMap.

Store:

```text
2 → 0
```

### Second iteration

```text
i = 1
current number = 7
difference = 9 - 7 = 2
```

`2` is already in the HashMap at index `0`.

Return:

```text
[0, 1]
```

Because:

```text
nums[0] + nums[1] = 2 + 7 = 9
```

## Complexity

```text
Time Complexity: O(n)
Space Complexity: O(n)
```

The array is checked only once, so this solution is faster than the brute-force `O(n²)` approach.
