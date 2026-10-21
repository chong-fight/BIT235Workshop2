public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 5000.00;
        double annualInterestRate = 0.04;
        int numberOfYears = 10;

        double amount = principal
                * Math.pow(1.0 + annualInterestRate, numberOfYears);
        double interestEarned = amount - principal;

        System.out.println("Compound Interest Calculator");
        System.out.printf("Principal: $%.2f%n", principal);
        System.out.printf("Annual interest rate: %.2f%%%n",
                annualInterestRate * 100);
        System.out.printf("Time period: %d years%n", numberOfYears);
        System.out.printf("Final amount: $%.2f%n", amount);
        System.out.printf("Interest earned: $%.2f%n", interestEarned);
    }
}
