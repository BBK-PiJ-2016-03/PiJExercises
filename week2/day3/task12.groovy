/* 12  Your change, please
Write a program that reads the total cost of a purchase and an amount of money that is paid to buy it. Your program should output the correct change specifying the amount
of notes (50, 20, 10, 5) and coins (2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01) needed. */

boolean validInput = false;
double totalCost = "";
double paymentTotal = "";
int totalCostPennies = 0;
int paymentTotalPennies = 0;

while(!validInput){
    print "Please enter total cost of purchase: ";
    String userTotalCost = System.console().readLine();

    print "Please enter payment total: ";
    String userPaymentTotal = System.console().readLine();

    try{
        totalCost = Double.parseDouble(userTotalCost);
        totalCostPennies = totalCost * 100;
        paymentTotal = Double.parseDouble(userPaymentTotal);
        paymentTotalPennies = paymentTotal * 100;
        validInput = true;
    }
    catch(NumberFormatException e){
        println "You did not enter a valid number for cost or total."
    }
}

int changeValue = paymentTotal - totalCost;

def calculateChange(BigDecimal changeTotal){

    Map<Integer, String> denominations = new LinkedHashMap<>();
    map.put(5000, "£50 notes: ");
    map.put(2000, "£20 notes: ");
    map.put(1000, "£10 notes: ");
    map.put(500, "£5 notes: ");
    map.put(100, "£1 coins: ");
    map.put(50, "50p coins: ");
    map.put(20, "20p coins: ");
    map.put(10, "10p coins: ");
    map.put(5, "5p coins: ");
    map.put(2, "2p coins: ");
    map.put(1, "1p coins: ");

    for(Map.Entry<Integer, String> change : denominations.entrySet()){
        int numberOfCoinsOrNotes = changetotal / change.getKey();
        println change.getValue() + numberOfCoinsOrNotes;
        changetotal -= (change.getKey()*numberOfCoinsOrNotes);
    }

}