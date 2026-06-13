// Last updated: 13/06/2026, 18:14:44
1class Solution {
2    public String intToRoman(int num) {
3
4        int[] values = {
5            1000, 900, 500, 400,
6            100, 90, 50, 40,
7            10, 9, 5, 4, 1
8        };
9
10        String[] romans = {
11            "M", "CM", "D", "CD",
12            "C", "XC", "L", "XL",
13            "X", "IX", "V", "IV", "I"
14        };
15
16        StringBuilder sc = new StringBuilder();
17
18        for (int i = 0; i < values.length; i++) {
19            while (num >= values[i]) {
20                sc.append(romans[i]);
21                num -= values[i];
22            }
23        }
24
25        return sc.toString();
26    }
27}