package Junit;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestTemplateInvocationContext;
import org.junit.jupiter.api.extension.TestTemplateInvocationContextProvider;

import java.util.List;
import java.util.stream.Stream;

public class PalindromeTestProvider implements TestTemplateInvocationContextProvider {

    @Override
    public boolean supportsTestTemplate(ExtensionContext context) {
        return true;  // Support all test templates
    }

    @Override
    public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
        return Stream.of(
            new SimpleTestTemplateInvocationContext("racecar", true),
            new SimpleTestTemplateInvocationContext("hello", false),
            new SimpleTestTemplateInvocationContext("A man, a plan, a canal, Panama!", true),
            new SimpleTestTemplateInvocationContext("Was it a car or a cat I saw?", true)
        );
    }

    // Inner class implementing TestTemplateInvocationContext
    private static class SimpleTestTemplateInvocationContext implements TestTemplateInvocationContext {
        private final String input;
        private final boolean expected;

        SimpleTestTemplateInvocationContext(String input, boolean expected) {
            this.input = input;
            this.expected = expected;
        }

        @Override
        public String getDisplayName(int invocationIndex) {
            return String.format("Test Palindrome: '%s' -> %s", input, expected); // Display name for the test
        }

        @Override
        public List getAdditionalExtensions() {
            return Stream.of().toList(); // No additional extensions needed
        }
        
        // Overriding the resolve method to pass parameters correctly
        public String getInput() {
            return input;
        }

        public boolean getExpected() {
            return expected;
        }
    }
}
