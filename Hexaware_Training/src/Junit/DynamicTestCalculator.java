package Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

class DynamicTestCalculator {

    static Calculator calculator;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        calculator = new Calculator();
        System.out.println("Calculator instance created.");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        calculator = null;
        System.out.println("Calculator instance destroyed.");
    }

    @TestFactory
    List<DynamicTest> dynamicTestsForAdd() {
        return Arrays.asList(
            DynamicTest.dynamicTest("Test Add 1 + 1", () -> assertEquals(2, calculator.add(1, 1))),
            DynamicTest.dynamicTest("Test Add 2 + 2", () -> assertEquals(4, calculator.add(2, 2))),
            DynamicTest.dynamicTest("Test Add -1 + -1", () -> assertEquals(-2, calculator.add(-1, -1))),
            DynamicTest.dynamicTest("Test Add 5 + 0", () -> assertEquals(5, calculator.add(5, 0)))
        );
    }

    @TestFactory
    List<DynamicTest> dynamicTestsForSub() {
        return Arrays.asList(
            DynamicTest.dynamicTest("Test Sub 3 - 1", () -> assertEquals(2, calculator.sub(3, 1))),
            DynamicTest.dynamicTest("Test Sub 5 - 2", () -> assertEquals(3, calculator.sub(5, 2))),
            DynamicTest.dynamicTest("Test Sub -5 - (-5)", () -> assertEquals(0, calculator.sub(-5, -5))),
            DynamicTest.dynamicTest("Test Sub 0 - 5", () -> assertEquals(-5, calculator.sub(0, 5)))
        );
    }
}
