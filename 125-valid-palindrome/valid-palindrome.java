class Solution {
    public boolean isPalindrome(String s) {
        if(s=="") return false;

        String res = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        String rev = new StringBuilder(res).reverse().toString();

        return res.equals(rev);
    }
}