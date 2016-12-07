/* Write a program that reads 10 numbers from the user and then prints the mean average. If the user inputs
something that is not a number, the program should complain and ask for a number again until 10 numbers have
been introduced */
import java.util.*;
public class Task3b{

    public static void main(String[] args){
        Task3b task = new Task3b();
        task.run();
    }

    private void run(){
        int numberQuantity = getNumberQuantityFromUser();
        List<Integer> numbers = getNumbersFromUser(numberQuantity);
        double average = getAverage(numbers);
        System.out.println(String.format("The average of your numbers is: %f", average));
    }

    private int getNumberQuantityFromUser(){
        int numberQuantity = 0;

        while(numberQuantity == 0){
            try{
                System.out.println("How many numbers would you like to average?");
                String input = System.console().readLine();
                numberQuantity = Integer.parseInt(input);
            }
            catch(NumberFormatException e){
                System.out.println("That was not a valid number.");
            }            
        }
        return numberQuantity;
    }

    private List<Integer> getNumbersFromUser(int total){
        List<Integer> numbers = new ArrayList<>();

        System.out.println(String.format("To calculate the mean average of %d numbers, ", total));

        while(numbers.size() < total){
            try{
                System.out.print(String.format("Please enter number %d :", (numbers.size()+1)));
                String input = System.console().readLine();
                int number = Integer.parseInt(input);
                numbers.add(number);
            }
            catch(NumberFormatException e){
                System.out.println("You did not enter a valid number.");
            }
        }

        return numbers;
    }

    private double getAverage(List<Integer> numbers){

        if(numbers.size() == 0)
            return 0;

        double total = 0;
        for(int number : numbers){
            total += number;
        }
        return total / numbers.size();
    }

}