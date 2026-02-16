// Last updated: 16/02/2026, 15:44:11
1class Solution{
2public void reverseString(char[]s){
3int left=0,right=s.length-1;
4while(left<right){
5char temp=s[left];
6s[left]=s[right];
7s[right]=temp;
8left++;
9right--;
10}
11}
12}