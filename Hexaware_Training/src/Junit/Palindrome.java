package Junit;

public class Palindrome {

    public boolean isPalindrome(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        return new StringBuilder(word).reverse().toString().equals(word);
    }
}
