package Task09_do_practice_while_not_understood;

import java.util.Scanner;

/**
 * Created by Alexander Worton on 07/01/2017.
 */
/*
Make a class that implements a method that reads a list of marks between 0 and 100 from the user, one per line,
and stops when the user introduces a -1. The program should output at the end (and only at the end) how many
marks there were in total, how many were distinctions (70–100), how many were passes (50–69), how many failed
(0–49), and how many were invalid (e.g. 150 or -3). Use readLine() exactly once. The output may look similar
to this example:
3
Input a mark: 13
Input a mark: 45
Input a mark: 63
Input a mark: 73
Input a mark: 101
Input a mark: 45
Input a mark: 18
Input a mark: 92
Input a mark: -1
There are 7 students: 2 distinctions, 1 pass, 4 fails (plus 1 invalid).
 */
public class App {
    private Scanner sc = new Scanner(System.in);
    private int total, distinctions, pass, fail, invalid;

    {
        total = distinctions = pass = fail = invalid = 0;
    }


    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        int mark = 0;
        while(!isTerminated(mark)) {
            mark = getNextMark();
            processMark(mark);
        }
        outputResults();
    }

    private boolean isTerminated(int mark) {
        return mark == -1;
    }

    private void processMark(int mark) {
        if(isTerminated(mark))
            return;

        if(!isValidMark(mark)){
            this.invalid++;
            return;
        }

        if(isDistinction(mark))
            this.distinctions++;
        else if(isPass(mark))
            this.pass++;
        else
            this.fail++;

        total++;
    }

    private boolean isPass(int mark) {
        return mark >= 50;
    }

    private boolean isDistinction(int mark) {
        return mark >= 70;
    }

    private void outputResults() {
        System.out.println(String.format("There are %d students: %d distinctions, %d pass, %d fails (plus %d invalid)."
                ,this.total
                ,this.distinctions
                ,this.pass,
                this.fail,
                this.invalid
                ));
    }

    private boolean isValidMark(int mark) {
        return mark >= 0 && mark <= 100;
    }

    private int getNextMark() {
        System.out.print("Input a mark: ");
        return readMark();
    }

    private int readMark() {
        String input = sc.next();
        int mark = -2;
        try{
            mark = Integer.parseInt(input);
        }
        catch(NumberFormatException e){
            //do nothing
        }
        return mark;
    }
}
