package com.example.mockitoexamples;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Unit test for simple App.
 */
public class MyServiceTestEX1 
{

    @Test
    public static void testExternalApi() {
        // Step 1: Create mock object
        ExternalAPIEX1 mockApi = mock(ExternalAPIEX1.class);

        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject mock into service and call method
        MyServiceEX1 service = new MyServiceEX1(mockApi);
        String result = service.fetchData();

        Assertions.assertEquals("Mock Data", result);
    }
}
