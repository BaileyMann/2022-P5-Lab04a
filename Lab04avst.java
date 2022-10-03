// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, 100 Point Version\n\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double monthlyRate = (annualRate/100) / 12;
        double numMonths = numYears * 12;
        double part1 = monthlyRate * Math.pow((1 + monthlyRate),numMonths);
        double part2 = Math.pow((1 + monthlyRate),numMonths) - 1;
        double part3 = (part1/part2) * principal;
        double part3Rounded = Math.round(part3*100);
        double part3Final = part3Rounded/100;
        double totalPayments = (part3 * numMonths);
        double totalPaymentsRounded = Math.round(totalPayments * 100);
        double totalPaymentsFinal = totalPaymentsRounded/100;
        double totalInterest = (totalPayments - principal);
        double totalInterestRounded = Math.round(totalInterest * 100);
        double totalInterestFinal = totalInterestRounded/100;

        System.out.println("Principal:\t\t\t" + "$" + principal);
        System.out.println("Annual Rate:\t\t" + annualRate + "%");
        System.out.println("Number of Years:\t" + numYears);
        System.out.println("Monthly Payment:\t" + "$" + part3Final);
        System.out.println("Total Payments:\t\t" + "$" + totalPaymentsFinal);
        System.out.println("Total Interest:\t\t" + "$" + totalInterestFinal);
    }
}

