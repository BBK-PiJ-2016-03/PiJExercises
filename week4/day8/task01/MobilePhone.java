public class MobilePhone extends OldPhone{

    private RecentNumbers lastNumbers;

    public MobilePhone(){
        lastNumbers = new RecentNumbers(10);
    }

    public void ringAlarm(String){
        System.out.println("Ring, Ring...");
    }

    public void playGame(String){
        System.out.println("Playing Game...");
    }

    public void printLastNumbers(){
        System.out.println("Recent Numbers:");
        for (number : lastNumbers){
            System.out.println("\t"+number);
        }
    }

}