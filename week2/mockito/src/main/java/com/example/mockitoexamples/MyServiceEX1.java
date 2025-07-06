package com.example.mockitoexamples;

/**
 * Hello world!
 *
 */
public class MyServiceEX1 
{
    private final ExternalAPIEX1 externalApi;

    public MyServiceEX1(ExternalAPIEX1 externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}
