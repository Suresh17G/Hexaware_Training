package Junit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestPalindrome {

    static Palindrome palindrome;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        palindrome = new Palindrome();  // Initialize Palindrome object
    }

    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "madam" })
    void testIsPalindrome(String word) {
        assertTrue(palindrome.isPalindrome(word));
    }
}
