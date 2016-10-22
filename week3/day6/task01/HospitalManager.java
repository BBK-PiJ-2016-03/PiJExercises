public class HospitalManager{
    private Patient firstPatient;

    //O(1)
    public HospitalManager(){
        this.firstPatient = null;
    }

    //O(N)
    public void addPatient(Patient newPatient){
        Patient currentPatient = this.firstPatient;

        if(currentPatient == null){
            this.firstPatient = newPatient;
            return;
        }

        while(currentPatient.getNextPatient() != null){
            currentPatient = currentPatient.getNextPatient();
        }

        currentPatient.setNextPatient(newPatient);
    }

    //O(N)
    public void removePatient(String name){
        Patient currentPatient = this.firstPatient;

        if(currentPatient.getName().equals(name)){
            this.firstPatient = currentPatient.getNextPatient();
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
                return true;
        }
        return false;
    }

    //O(N)
    public void printPatients(){
        Patient currentPatient = this.firstPatient;
        System.out.println("---------------------------------------------------");
        while(currentPatient != null){
            System.out.println(currentPatient);
            currentPatient = currentPatient.getNextPatient();
        }
        System.out.println("---------------------------------------------------");
        System.out.println();
    }
}