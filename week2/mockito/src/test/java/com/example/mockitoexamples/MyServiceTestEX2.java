package com.example.mockitoexamples;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MyServiceTestEX2 {
     @Test
    public static void testVerifyInteraction() {
        // Step 1: Create a mock object
        ExternalAPIEX2 mockApi = mock(ExternalAPIEX2.class);

        // Step 2: Create service with mock and call method
        MyServiceEX2 service = new MyServiceEX2(mockApi);
        service.fetchData();

        // Step 3: Verify that getData() was called
        verify(mockApi).getData();
    }
}
