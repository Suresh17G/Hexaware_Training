package Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestCalculator {

    static Calculator calculator;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("Before all tests - Initializing Calculator");
        calculator = new Calculator();
    }

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("Before each test");
    }

    @RepeatedTest(2)  // Repeats this test 5 times
    void testAdd() {
        System.out.println("Running testAdd");
        int result = calculator.add(2, 3);  // Example: 2 + 3 = 5
        assertEquals(5, result);
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("After each test");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("After all tests - Cleanup Calculator");
    }
}
