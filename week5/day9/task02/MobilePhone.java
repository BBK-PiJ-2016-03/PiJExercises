public class MobilePhone extends OldPhone{

    private RecentNumbers lastNumbers = new RecentNumbersList(10);

    /**
    * Empty constructor for MobilePhone
    */
    public MobilePhone(){

    }

    /**
    * Constructor for MobilePhone taking a brand parameter
    * @param brand sets the brand for the phone by calling the super constructor
    */
    public MobilePhone(String brand){
        super(brand);
    }

    /**
    * Override the call method, calling super and recording a list of recent calls
    * @param number provides the destination for tha call
    */
    @Override
    public void call(String number){
        super.call(number);
        lastNumbers.add(number);
    }

    public void storeCalledNumber(String number){
        lastNumbers.add(number);
    }

    /**
    * getter for value
    * @param alarm provides the alarm message
    */
    public void ringAlarm(String alarm){
        System.out.println("Ring, Ring... "+alarm);
    }

    /**
    * getter for value
    * @param game selects the game
    */
    private void playGame(String game){
        System.out.println("Playing Game... " + game);
    }

    /**
    * prints the recent numbers
    */
    public void printLastNumbers(){
        System.out.println("");
        System.out.println("Recent Numbers: " + lastNumbers.length());
        System.out.println(lastNumbers);
        System.out.println("");
    }

}