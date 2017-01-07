public class Patient{
    private String name = "";
    private int age = 0;
    private String condition = "";
    private Patient nextPatient = null;

    public Patient(String name, int age){
        this.name = name;
        this.age = age;
        if(age >= 130 || age < 0){
            throw new IllegalArgumentException("Age is out of range");
        }
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getCondition(){
        return this.condition;
    }

    public Patient getNextPatient(){
        return this.nextPatient;
    }

    public void setNextPatient(Patient nextPatient){
        this.nextPatient = nextPatient;
    }

    @Override
    public String toString(){
        return name + " (" + age + ") ["+ condition + "]";
    }
}