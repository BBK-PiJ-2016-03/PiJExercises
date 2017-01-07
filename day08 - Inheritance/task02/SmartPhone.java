public class SmartPhone extends MobilePhone{

    public void browseWeb(String url){
        System.out.println("Browsing url: "+url);
    }

    public Position findPosition(){
        return new Position(getPos(), getPos());
    }

    private double getPos(){
        return (((Math.random() * 180000000) - 90000000) / 10E5);
    }

    /**
    * Override to handle international call saving via internet
    * @param number provides detination of call
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