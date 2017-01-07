public class OldPhone implements Phone{

    private String brand = null;

    /**
    * Base empty constructor
    */
    public OldPhone() {
    }

    /**
    * Base constructor
    * @param brand sets the brand of the phone
    */
    public OldPhone(String brand) {
        this.brand = brand;
    }

    /**
    * Base calling implementation
    * @param number provides the destination fro the call
    */
    public void call(String number){
        System.out.println("Calling " + number + "...");
    }

    /**
    * getter for brand
    * @return brand of the phone
    */
    public String getBrand() {
        return brand;
    }
    // ... there is no setter for brand


}