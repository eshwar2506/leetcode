// Last updated: 12/06/2026, 17:12:35
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int l = 0, r = nums.length;
4
5        while (l < r) {
6            int m = (l + r) / 2;
7
8            if (nums[m] < target)
9                l = m + 1;
10            else
11                r = m;
12        }
13
14        return l;
15    }
16}