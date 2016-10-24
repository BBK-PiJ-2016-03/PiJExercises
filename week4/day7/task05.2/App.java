public class App{
    public static void main(String[] args){

        IntegerToStringMap map = new IntegerToStringMap();

        map.put(1, "a");
        System.out.println(map.get(1));

        map.remove(1);
        System.out.println(map.get(1));

        System.out.println("---");

        map.put(10000, "b");
        System.out.println(map.get(10000));

        map.remove(10000);
        System.out.println(map.get(10000));
    }
}