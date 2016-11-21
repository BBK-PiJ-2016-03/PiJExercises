/* Write a program that reads 10 numbers from the user and then prints the mean average. If the user inputs
something that is not a number, the program should complain and ask for a number again until 10 numbers have
been introduced */
import java.util.*;
public class Task3a{

    public static void main(String[] args){
        Task3a task = new Task3a();
        task.run();
    }

    private void run(){
        List<Integer> numbers = getNumbersFromUser(10);
        int average = getAverage(numbers);
        System.out.println(String.format("The average of your numbers is: %d", average));
    }

    private List<Integer> getNumbersFromUser(int total){
        List<Integer> numbers = new ArrayList<>();

        System.out.print(String.format("To calculate the mean average of %d numbers, ", total));

        while(numbers.size() < total){
            try{
                System.out.print("Please enter a valid number :");
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

    private int getAverage(List<Integers> numbers){

        if(numbers.size() == 0)
            return 0;

        long total = 0;
        for(int number : numbers){
            total += number;
        }
        return (int)(total / numbers.size());
    }

}