public class MobilePhone extends OldPhone{

    private RecentNumbers lastNumbers;

    /**
    * Constructor for MobilePhone
    * Initialises the recent number list
    */
    public MobilePhone(){
        lastNumbers = new RecentNumbersList(10);
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
    public void playGame(String game){
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