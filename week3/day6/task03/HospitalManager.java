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

        if(this.lastPatient == null){
            addFirstPatient(newPatient);
            return;
        }

        addNewPatient(newPatient);
    }

    private void addNewPatient(Patient newPatient){
        this.lastPatient.setNextPatient(newPatient);
        this.lastPatient = newPatient;
        this.totalPatients++;
    }

    private void addFirstPatient(Patient newPatient){
        this.firstPatient = newPatient;
        this.lastPatient = newPatient;
        this.totalPatients++;
    }

    //O(N)
    public void removePatient(String name){
        Patient currentPatient = this.firstPatient;

        if(currentPatient.getName().equals(name)){
            this.firstPatient = currentPatient.getNextPatient();
            this.totalPatients--;
        }

        while(currentPatient.getNextPatient() != null){
            if(tryToRemoveNextPatient(name, currentPatient))
                break;
            currentPatient = currentPatient.getNextPatient();
        }
    }

    private boolean tryToRemoveNextPatient(String name, Patient previous){
        Patient candidateToRemove = previous.getNextPatient();

        if(candidateToRemove == null)
            return false;

        if(candidateToRemove.getName().equals(name)){
                previous.setNextPatient(candidateToRemove.getNextPatient());
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
        System.out.println("---------------------------------------------------");
        while(currentPatient != null){
            System.out.println(currentPatient);
            currentPatient = currentPatient.getNextPatient();
        }
        System.out.println("---------------------------------------------------");
        System.out.println();
    }

    public int getNumberOfPatients(){
        return this.totalPatients;
    }
}