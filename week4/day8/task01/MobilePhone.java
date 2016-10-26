public class MobilePhone extends OldPhone{

    private RecentNumbers lastNumbers;

    public MobilePhone(){
        lastNumbers = new RecentNumbersList(10);
    }

    @Override
    public void call(String number){
        super.call(number);
        lastNumbers.add(number);
    }

    public void ringAlarm(String alarm){
        System.out.println("Ring, Ring... "+alarm);
    }

    public void playGame(String game){
        System.out.println("Playing Game... " + game);
    }

    public void printLastNumbers(){
        System.out.println("");
        System.out.println("Recent Numbers: " + lastNumbers.length());
        for(int i = 0; i < lastNumbers.length(); i++){
            System.out.println("\t"+lastNumbers.getNumber(i));
        }
        System.out.println("");
    }

}