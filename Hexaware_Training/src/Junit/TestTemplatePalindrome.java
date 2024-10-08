package Junit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestTemplateInvocationContext;
import org.junit.jupiter.api.extension.TestTemplateInvocationContextProvider;

import java.util.stream.Stream;

class TestTemplatePalindrome {

    static Palindrome palindromeChecker;

    @BeforeAll
    static void setUpBeforeClass() {
        palindromeChecker = new Palindrome();  // Initialize PalindromeChecker instance
        System.out.println("PalindromeChecker instance created.");
    }

    @AfterAll
    static void tearDownAfterClass() {
        palindromeChecker = null;  // Destroy PalindromeChecker instance
        System.out.println("PalindromeChecker instance destroyed.");
    }

    @TestTemplate
    @ExtendWith(PalindromeTestProvider.class)
    void testIsPalindrome(String input, boolean expectedResult) {
        assertEquals(expectedResult, palindromeChecker.isPalindrome(input));
    }
}
