class Solution {
    public int removePalindromeSub(String s) {
         StringBuilder s1=new StringBuilder(s);

         // The solution can be either '1' or '2'
         // 0 is not an option as '1 <= s.length <= 1000'

         // The string can be palindrome so the solution is 1
         s1.reverse();
         if (s1.toString().equals(s))
            return 1;

         // All the a's can be removed in 1st step and all the b's can be removed in 2nd step
         // So the max solution can be 2
         return 2;
    }
}
