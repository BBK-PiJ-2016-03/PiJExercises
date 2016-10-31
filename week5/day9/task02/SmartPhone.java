public class SmartPhone extends MobilePhone{

    /**
    * Empty constructor for MobilePhone
    */
    public SmartPhone(){

    }

    /**
    * Constructor for MobilePhone taking a brand parameter
    * @param brand sets the brand for the phone by calling the super constructor
    */
    public SmartPhone(String brand){
        super(brand);
    }

    public void browseWeb(String url){
        System.out.println("Browsing url: " + url);
    }

    public Position findPosition(){
        return new Position(getPos(), getPos());
    }

    /**
    * @return a random lat or lon value
    */
    private double getPos(){
        return (((Math.random() * 180000000) - 90000000) / 10E5);
    }


    /**
    * getter for value
    * @param game selects the game
    */
    public void playGame(String game){
        System.out.println("Playing Game... " + game);
    }

    /**
    * Override to handle international call saving via internet
    * @param number provides destination of call
    */
    @Override
    public void call(String number){
        if(number.substring(0,2).equals("00")){
            System.out.println("Calling " + number + " through the internet to save money");
            super.storeCalledNumber(number);
            return;
        }
        super.call(number);
    }
}