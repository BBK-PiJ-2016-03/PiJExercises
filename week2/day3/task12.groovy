/* 12  Your change, please
Write a program that reads the total cost of a purchase and an amount of money that is paid to buy it. Your program should output the correct change specifying the amount
of notes (50, 20, 10, 5) and coins (2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01) needed. */

print "Please enter total cost of purchase: ";
String userTotalCost = System.console().readLine();

print "Please enter payment total: ";
String userPaymentTotal = System.console().readLine();

try{
    BigDecimal totalCost = new BigDecimal(userTotalCost);
    BigDecimal totalCost = new BigDecimal(userTotalCost);

    double paymentTotal = Double.parseDouble(userPaymentTotal);

    double changeValue = paymentTotal - totalCost;

}
catch(NumberFormatException e){

}