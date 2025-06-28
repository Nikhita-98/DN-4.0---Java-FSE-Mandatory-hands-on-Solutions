//Example 1 and 2 setting up and writing a basic JUnit test for a simple class
package Week_2.Junit_Basic_Testing;

import org.junit.Test;
import static org.junit.Assert.*;

public class Greettest {
    @Test
    public void testSayHello() {
        Greet greet = new Greet();
        assertEquals("Hello World!", greet.sayHello());
    }
}
