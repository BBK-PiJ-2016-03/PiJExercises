package Task04;

public class HospitalManager{
    private Patient firstPatient;

    //O(1)
    public HospitalManager(){
        this.firstPatient = null;
    }

    //O(N)
    public void addPatient(Patient newPatient){
        if(this.firstPatient == null){
           addFirstPatient(newPatient);
           return;
        }
        addAnotherPatient(newPatient); 
    }

    private void addFirstPatient(Patient newPatient){
        this.firstPatient = newPatient;
        this.firstPatient.setNextPatient(this.firstPatient);
    }

    private void addAnotherPatient(Patient newPatient){        
        Patient lastPatient = getLastPatient();
        lastPatient.setNextPatient(newPatient);
        newPatient.setNextPatient(this.firstPatient);
    }

    private Patient getLastPatient(){
        Patient currentPatient = this.firstPatient;
        while(currentPatient.getNextPatient() != this.firstPatient){
            currentPatient = currentPatient.getNextPatient();
        }
        return currentPatient;
    }

    //O(N)
    public void removePatient(String name){

        if(this.firstPatient == null)
            return;

        if(this.firstPatient.getNextPatient() == null){
            removeLastPatient();
            return;
        }

        removeAnotherPatient(name);            

        Patient currentPatient = this.firstPatient;

        if(currentPatient.getName().equals(name)){
            this.firstPatient = currentPatient.getNextPatient();
        }        
    }

    private void removeLastPatient(){
        this.firstPatient = null;
    }

    private void removeAnotherPatient(String name){
        Patient prevPatient = getPreviousPatient(name);
        if(prevPatient == null)
            return;

        removeNextPatient(prevPatient);
    }

    private Patient getPreviousPatient(String name){
        Patient currentPatient = this.firstPatient;

        if(currentPatient.getNextPatient().getName().equals(name))
            return currentPatient;

        while(!currentPatient.getNextPatient().equals(this.firstPatient) && !currentPatient.getNextPatient().getName().equals(name)){
            currentPatient = currentPatient.getNextPatient();
        }

        if(currentPatient.equals(this.firstPatient))
            return null;

        return currentPatient;
    }

    private void removeNextPatient(Patient prevPatient){
        Patient skipPatient = prevPatient.getNextPatient().getNextPatient();
        prevPatient.setNextPatient(skipPatient);
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
        do{
            System.out.println(currentPatient);
            currentPatient = currentPatient.getNextPatient();
        }while(!currentPatient.equals(this.firstPatient));
        System.out.println("---------------------------------------------------");
        System.out.println();
    }
}