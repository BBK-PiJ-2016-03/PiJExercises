public class App{
    public static void main(String[] args){
        Electric instrument = new Electric();

        Guitar ins2 = (Guitar)instrument;

        System.out.println(instrument.twoTunerPos(5));
        System.out.println(instrument.twoTunerPos(5));

        System.out.println("---");

        System.out.println(instrument.tunerPos(5));
        System.out.println(instrument.tunerPos(5));

        System.out.println(instrument);
    }
}