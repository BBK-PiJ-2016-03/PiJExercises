//7 A bit more practice with doubles
/*Write a program that asks the user for the total amount borrowed for a mortgage, the number of years to pay
it back, and the interest rate (in this exercise, we assume it is a fixed rate). The program can then calculate how
much must be paid at the end*/



print("Please enter the total amount borrowed for the mortgage: ");
String inputBorrowing = System.console().readLine();
double borrowing = Double.parseDouble(inputBorrowing);

print("Please enter the number of years to pay it back: ");
String inputYearsToRepay = System.console().readLine();
int yearsToRepay = Integer.parseInt(inputYearsToRepay);

print("Please enter the interest rate: ");
String inputInterestRate = System.console().readLine();
double interestRate = Double.parseDouble(inputInterestRate);

Mortgage mortgage = new Mortgage(borrowing, yearsToRepay, interestRate);

class Mortgage{

    private double initialCapital = 0.0;
    private int durationOfLoan = 0;
    private double interestRate = 0.0;

    public Mortgage(double amountBorrowed, int years, double interestRate){
        this.initialCapital = amountBorrowed;
        this.durationOfLoan = years;
        this.interestRate = interestRate;
    }

    public double getTotalRepayment(){

    }

    public double getAnnualRepayment(){

    }

    public double getYearsUntilInterestPaid(){

    }

}