class Solution {
    public boolean isPalindrome(int x) {
        String ab=Integer.toString(x);
        StringBuilder check = new StringBuilder(ab);
        check.reverse();
        
        return check.toString().equals(ab);
    }
}
