public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories")
        };

        // Linear Search
        Product found1 = SearchUtils.linearSearch(products, "Shoes");
        System.out.println("Linear Search Result: " + (found1 != null ? found1 : "Not Found"));

        // Binary Search
        SearchUtils.sortProductsByName(products);
        Product found2 = SearchUtils.binarySearch(products, "Shoes");
        System.out.println("Binary Search Result: " + (found2 != null ? found2 : "Not Found"));
    }
}
