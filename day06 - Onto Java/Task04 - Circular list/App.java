package Task04;

public class App{
    public static void main(String[] args){

        HospitalManager hospital = new HospitalManager();

        hospital.addPatient(new Patient("Barry Eples", 28, "Plague"));
        hospital.addPatient(new Patient("Susan Salami", 87, "Toxic Shock"));
        hospital.addPatient(new Patient("Martin Delares", 74, "Arthritis"));
        hospital.addPatient(new Patient("Sarah Alician", 6, "Mumps"));
        hospital.addPatient(new Patient("Mohammed Al Elahi", 9, "Tonsilitis"));
        hospital.addPatient(new Patient("Terence Degario", 45, "Heart Problems"));
        hospital.addPatient(new Patient("Nigel Hamasby", 61, "Gangrene"));
        hospital.addPatient(new Patient("Umair Rumain", 30, "Stubbed Toe"));
        hospital.addPatient(new Patient("Uma Theremin", 48, "Broken Nail"));
        hospital.addPatient(new Patient("Jen Germaine", 72, "Headache"));

        hospital.printPatients();

        hospital.removePatient("Barry Eples");
        hospital.removePatient("Jen Germaine");
        hospital.removePatient("Terence Degario");

        hospital.printPatients();
    }
}