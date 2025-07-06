package com.example.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTes_Exercise4t 
{
    /**
     * Rigorous Test :-)
     */
    private static App app;
    @BeforeAll
    public static void setUp() {
        // This method can be used to set up any common test data or state
        app = new App();
        System.out.println("Setting up before each test");
    }

    @AfterAll
    public static void tearDown() {
        app = null;
        System.out.println("Teardown executed");
    }

    @Test
    public void testAdd()
    {
        int result = app.add(2, 3);
        Assertions.assertEquals(5, result);
    }
    @Test
    public void testSubtract() {
        int result = app.subtract(5, 3);
        Assertions.assertEquals(2, result);
    }
}
