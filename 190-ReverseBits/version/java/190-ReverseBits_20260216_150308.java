// Last updated: 16/02/2026, 15:03:08
1class Solution {
2    public int reverseBits(int n) {
3        int rev = 0;
4        for(int i = 0; i < 32; i++) {
5            rev = (rev << 1) | ((n >> i) & 1);
6        }
7        return rev;
8    }
9}