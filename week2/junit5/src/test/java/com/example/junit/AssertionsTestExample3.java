package com.example.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AssertionsTestExample3 {
    // Note: Actual test methods should be annotated with @Test and placed in a separate test class.
    @Test
    public void exampleAssertion() {
        int expected = 5;
        int actual = 2 + 3;
        //Assert Equals
        Assertions.assertEquals(expected, actual, "The addition result should be equal to the expected value.");
    }
    @Test
    public void exampleAssertionWithCondition() {
        boolean condition = true;
        //Assert True
        Assertions.assertTrue(condition, "The condition should be true.");
    }
    @Test
    public void exampleAssertionWithFalseCondition() {
        boolean condition = false;
        //Assert False
        Assertions.assertFalse(condition, "The condition should be false.");
    }
    @Test
    public void exampleAssertionWithNull() {
        String str = null;
        //Assert Null
        Assertions.assertNull(str, "The string should be null.");
    }
    @Test
    public void exampleAssertionWithNotNull() {
        String str = "JUnit 5";
        //Assert Not Null
        Assertions.assertNotNull(str, "The string should not be null.");
    }
}
