/*Write a class that asks for data (name and year of birth) about new patients in a hospital and keeps them in a list
of Patient. The constructor of Patient must throw an IllegalArgumentException if the age of the patient is
negative or greater than 130.*/
import java.util.*;
public class MorePatients{

    private List<Patient> patients = new LinkedList<>();

    public static void main(String[] args){
        MorePatients mp = new MorePatients();
        mp.run();
    }

    private void run(){
        boolean running = true;
        while(running){
        running = showMenu();
    }

    private boolean showMenu(){
        System.out.println("Hospital Manager");
        System.out.println("Please select a choice:");
        System.out.println("\t1. Enter Patient");
        System.out.println("\t2. Print Patients");
        System.out.println("\t3. Quit");

        return handleUserResponse(getUserResponse());
    }

    private String getUserResponse(){
        String choice = System.console().readLine();        
    }

    private boolean handleUserResponse(String response){
        switch(response){
            case "1":
                enterPatient();
                return true;
            case "2":
                printPatients();
                return true;
            case "3":
                return false;
            default:
                System.out.println("That was not a valid input");
                return true;
                break;
        }
    }

    private void enterPatient(){        
        String name = getPatientName();
        int age = getPatientAge();
        Patient patient = new Patient(name, age);
        this.patients.add(patient);
    }

    private void printPatients(){
        for(patient : this.patients){
            System.out.println(patient);
        }
    }    

    private String getPatientName(){
        String name = "";
        while(name == ""){
            System.out.print("Please enter the patient's name: '");
            String name = System.console().readLine();
        }        
        return name;
    }

    private int getPatientAge(){
        int age = -1;
        while(age < 0 || age >= 130){
            try{
                System.out.print("Please enter the patient's age: '");
                int age = Integer.parseInt(System.console().readLine());
            }
            catch(NumberFormatException e){
                System.out.println("You have entered an invalid age");
            }
            if(age < 0 || age >= 130)
                System.out.println("That age is out of bounds!");
        }
        return age;
    }

}