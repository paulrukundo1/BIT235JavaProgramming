public class CompoundInterest {
    public static void main(String[] args) {
        // Given values
        double principal = 5000.00;   // P = $5000.00 investment
        double rate = 0.04;           // r = 4% interest rate per year (as a decimal)
        int years = 10;               // n = 10 years

        // Apply the compound interest formula: A = P * (1 + r)^n
        double amount = principal * Math.pow(1 + rate, years);

        // Calculate the interest earned
        double interest = amount - principal;

        // Display the results
        System.out.println("Compound Interest Calculation");
        System.out.println("-----------------------------");
        System.out.printf("Principal (P):        $%.2f%n", principal);
        System.out.printf("Interest Rate (r):     %.0f%% per year%n", rate * 100);
        System.out.printf("Number of Years (n):   %d%n", years);
        System.out.println("-----------------------------");
        System.out.printf("Total Amount (A):     $%.2f%n", amount);
        System.out.printf("Interest Earned:      $%.2f%n", interest);
    }
}