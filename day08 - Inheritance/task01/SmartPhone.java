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
}