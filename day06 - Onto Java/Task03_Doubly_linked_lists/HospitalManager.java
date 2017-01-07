package Task03_Doubly_linked_lists;

public class HospitalManager{
    private Patient firstPatient;
    private Patient lastPatient;
    private int totalPatients;

    //O(1)
    public HospitalManager(){
        this.firstPatient = null;
        this.lastPatient = null;
        this.totalPatients = 0;
    }

    //O(1)
    public void addPatient(Patient newPatient){

        if(this.totalPatients == 0){
            addFirstPatient(newPatient);
            return;
        }

        addNewPatient(newPatient);
    }

    private void addNewPatient(Patient newPatient){

        Patient previous = this.lastPatient;

        if(previous == null)
            previous = this.firstPatient;

        previous.setNextPatient(newPatient);
        this.lastPatient = newPatient;
        this.lastPatient.setPrevPatient(previous);
        this.totalPatients++;
    }

    private void addFirstPatient(Patient newPatient){
        this.firstPatient = newPatient;
        this.totalPatients++;
    }

    //O(N)
    public void removePatient(String name){
        Patient currentPatient = this.firstPatient;

        if(currentPatient.getName().equals(name) && this.totalPatients <= 1){
            removeLastPatient();
            return;
        }
        else if(currentPatient.getName().equals(name)){
            removeFirstPatient(currentPatient);
            return;
        }

        while(currentPatient != null){
            if(tryToRemovePatient(name, currentPatient))
                break;
            currentPatient = currentPatient.getNextPatient();
        }
    }

    private void removeFirstPatient(Patient patient){
        this.firstPatient = this.firstPatient.getNextPatient();
        if(this.firstPatient != null)
            this.firstPatient.setPrevPatient(null);
        this.totalPatients--;
    }

    private void removeLastPatient(){
        this.firstPatient = null;
        this.lastPatient = null;
        this.totalPatients--;
    }

    private boolean tryToRemovePatient(String name, Patient patient){

        if(patient == null)
            return false;

        if(patient.getName().equals(name)){
            Patient prev = patient.getPrevPatient();
            Patient next = patient.getNextPatient();

            if(prev != null)
                prev.setNextPatient(next);

            if(next != null)
                next.setPrevPatient(prev);

            if(patient.equals(this.firstPatient))
                this.firstPatient = patient.getNextPatient();

            if(patient.equals(this.lastPatient))
                this.lastPatient = patient.getPrevPatient();

            this.totalPatients--;
            return true;
        }
        return false;
    }

    //O(N)
    public void printPatients(){
        Patient currentPatient = this.firstPatient;
        String patientDisplay = this.totalPatients == 1 ? "Patient" : "Patients";
        System.out.println(this.totalPatients + " " + patientDisplay);
        if(this.totalPatients > 0){
            printPatientsData(currentPatient);
        }
    }

    private void printPatientsData(Patient currentPatient){
        printSpacer();
        while(currentPatient != null){
            System.out.println(currentPatient);
            currentPatient = currentPatient.getNextPatient();
        }
        printSpacer();
        System.out.println();
    }

    private void printSpacer(){
        System.out.println("---------------------------------------------------");
    }

    public int getNumberOfPatients(){
        return this.totalPatients;
    }
}