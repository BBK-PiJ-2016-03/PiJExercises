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
        this.firstPatient.setPrevPatient = null;
        this.totalPatients--;
    }

    private void removeLastPatient(Patient patient){
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