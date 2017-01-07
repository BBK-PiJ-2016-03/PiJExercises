public class UnfairPersonQueue implements PersonQueue{

    private Person firstPerson = null;
    private int count = 0;

    @Override
    public void insert(Person person){

        if(count == 0){
            firstPerson = person;
            count++;
            return;
        }

        Person currentPerson = firstPerson;
        Person previousPerson = null;
        while(currentPerson.getNextPerson() != null){
            if(tryToInsertPerson(person, previousPerson, currentPerson))
                break;

            previousPerson = currentPerson;
            currentPerson = currentPerson.getNextPerson();
        }
    }

    private boolean tryToInsertPerson(Person person, Person previousPerson, Person currentPerson){
        if(person.getAge() > currentPerson.getAge()){
            insertPerson(person, previousPerson, currentPerson);
            return true;
        }
        return false;
    }

    private void insertPerson(Person person, Person previousPerson, Person currentPerson){
        if(previousPerson == null){
            Person tempPerson = this.firstPerson;
            this.firstPerson = person;
            this.firstPerson.setNextPerson(tempPerson);
        }
        else{
            previousPerson.setNextPerson(person);
        }
        person.setNextPerson(currentPerson);
    }

    @Override
    public Person retrieve(){
        if(firstPerson == null)
            return null;

        Person returnPerson = firstPerson;
        firstPerson = firstPerson.getNextPerson();
        count--;
        return returnPerson;
    }
}