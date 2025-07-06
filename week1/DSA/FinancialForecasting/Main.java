import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 
            System.out.println("Enter present value (as a decimal):");
            double presentValue = sc.nextDouble();     // starting money
            System.out.println("Enter growth rate (as a decimal):");
            double growthRate = sc.nextDouble();        // 5% growth per year
            System.out.println("Enter number of years:");
            int years = sc.nextInt();                   // forecast for 5 years

            double future = Forecast.futureValue(presentValue, growthRate, years);

            System.out.printf("Future value after %d years: %.2f\n", years, future);
        }
        
    }
}
