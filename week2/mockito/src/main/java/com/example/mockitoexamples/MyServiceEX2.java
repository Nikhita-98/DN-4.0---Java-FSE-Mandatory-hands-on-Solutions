package com.example.mockitoexamples;

public class MyServiceEX2 {
    private final ExternalAPIEX2 externalApi;

    public MyServiceEX2(ExternalAPIEX2 externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData(); // This will be verified in the test
    }
}
